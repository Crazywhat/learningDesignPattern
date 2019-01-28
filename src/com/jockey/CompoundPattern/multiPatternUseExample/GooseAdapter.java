package com.jockey.CompoundPattern.multiPatternUseExample;

// AdapterPattern

public class GooseAdapter implements Quackable {
	private Goose goose;
	private Observable observable;
	
	public GooseAdapter(Goose goose) {
		super();
		this.goose = goose;
		this.observable = new Observable(this);
	}

	@Override
	public void quack() {
		goose.honk();
		notifyObservers();
	}

	@Override
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	@Override
	public void notifyObservers() {
		observable.notifyObservers();
	}

	@Override
	public String toString() {
		return "GooseDuck";
	}
	
}
