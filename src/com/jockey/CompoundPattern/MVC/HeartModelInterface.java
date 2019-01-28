package com.jockey.CompoundPattern.MVC;

public interface HeartModelInterface {
	void start();
	int getHeartRate();
	void registerObserver(BeatObserver o);
	void removeObserver(BeatObserver o);
	void registerObserver(BPMObserver o);
	void removeObserver(BPMObserver o);
	void notifyAllBeatObservers();
	void notifyAllBPMObservers();
}
