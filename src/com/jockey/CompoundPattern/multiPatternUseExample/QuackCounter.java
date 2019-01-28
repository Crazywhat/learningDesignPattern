package com.jockey.CompoundPattern.multiPatternUseExample;

//DecoratorPattern

public class QuackCounter implements Quackable {
	private Quackable duck;
	
	static int numberOfQuacks = 0;
	
	public QuackCounter(Quackable duck) {
		super();
		this.duck = duck;
	}

	@Override
	public void quack() {
		++numberOfQuacks;
		duck.quack();
	}

	public static int getNumberOfQuacks() {
		return numberOfQuacks;
	}

	@Override
	public void registerObserver(Observer observer) {
		duck.registerObserver(observer);
	}

	@Override
	public void notifyObservers() {
		duck.notifyObservers();
	}
}
