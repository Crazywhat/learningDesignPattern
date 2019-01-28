package com.jockey.CompoundPattern.multiPatternUseExample;

import java.util.ArrayList;

//ObserverPattern

public interface QuackObservable {
	public void registerObserver(Observer observer);
	public void notifyObservers();
}


class Observable implements QuackObservable{
	ArrayList<Observer> observers = new ArrayList<>(); 
	QuackObservable duck;
	
	public Observable(QuackObservable duck) {
		super();
		this.duck = duck;
	}

	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(duck);
		}
	}
}