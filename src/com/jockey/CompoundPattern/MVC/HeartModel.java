package com.jockey.CompoundPattern.MVC;

import java.util.ArrayList;
import java.util.Random;

public class HeartModel implements HeartModelInterface,Runnable{
	ArrayList<BeatObserver> beatObservers = new ArrayList<>();
	ArrayList<BPMObserver> bpmObservers = new ArrayList<>();
	
	int time = 1000;
	int bpm = 90;
	Random random = new Random(System.currentTimeMillis());
	Thread thread;
	
	public HeartModel() {
		thread = new Thread(this);
	}
	
	
	@Override
	public int getHeartRate() {
		return 60000/time;
	}

	@Override
	public void registerObserver(BeatObserver o) {
		beatObservers.add(o);
	}

	@Override
	public void removeObserver(BeatObserver o) {
		beatObservers.remove(o);
	}

	@Override
	public void registerObserver(BPMObserver o) {
		bpmObservers.add(o);
	}

	@Override
	public void removeObserver(BPMObserver o) {
		bpmObservers.remove(o);
	}
	

	@Override
	public void run() {	
		int lastrate = -1;
		
		for(;;) {
		
			int change = random.nextInt(10);
			if (random.nextInt(2) == 0) {
				change = 0 -change;
			}
			int rate = 60000/(time + change);
			if (rate < 120 && rate >50) {
				time += change;
				notifyAllBeatObservers();
				if (rate != lastrate) {
					lastrate = rate;
					notifyAllBPMObservers();
				}
			}
			try {
				Thread.sleep(time);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}


	@Override
	public void notifyAllBeatObservers() {
		for (BeatObserver beatObserver : beatObservers) {
			beatObserver.updateBeat();
		}
	}


	@Override
	public void notifyAllBPMObservers() {
		for (BPMObserver observer : bpmObservers) {
			observer.updateBPM();
		}
	}


	@Override
	public void start() {
		thread.start();
	}

}
