package com.jockey.CompoundPattern.MVC;

public class HeartAdapter implements BeatModelInterface {
	
	HeartModelInterface heart;
	
	public HeartAdapter(HeartModelInterface heart) {
		super();
		this.heart = heart;
	}

	@Override
	public void initialize() {
		
	}

	@Override
	public void on() {
	}

	@Override
	public void off() {

	}

	@Override
	public void setBPM(int bpm) {
	}

	@Override
	public int getBPM() {
		return heart.getHeartRate();
	}
	
	@Override
	public void registerObserver(BeatObserver o) {
		heart.registerObserver(o);
	}

	@Override
	public void removeObserver(BeatObserver o) {
		heart.removeObserver(o);
	}

	@Override
	public void registerObserver(BPMObserver o) {
		heart.registerObserver(o);
	}

	@Override
	public void removeObserver(BPMObserver o) {
		heart.removeObserver(o);
	}
	
	public void notifyBeatObservers() {
		heart.notifyAllBeatObservers();
	}
	

	@Override
	public void notifyBPMObservers() {
		heart.notifyAllBPMObservers();
	}
}
