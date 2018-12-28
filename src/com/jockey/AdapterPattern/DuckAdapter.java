package com.jockey.AdapterPattern;

public class DuckAdapter implements Turkey {
	Duck duck;
	
	public DuckAdapter(Duck duck) {
		super();
		this.duck = duck;
	}

	@Override
	public void gobble() {
		duck.quack();
	}

	@Override
	public void fly() {
		duck.fly();
	}

}
