package com.jockey.CompoundPattern.multiPatternUseExample;

public interface Observer {
	public abstract void update(QuackObservable duck);
}

class Quackologist implements Observer{

	@Override
	public void update(QuackObservable duck) {
		System.out.println("Quackologist: " + duck +
				" just quacked.");
	}
	
}
