package com.jockey.AdapterPattern;

public interface Turkey {
	public void gobble();
	public void fly();
}


class WildTurkey implements Turkey{

	@Override
	public void gobble() {
		System.out.println("Gobble gobble");
	}

	@Override
	public void fly() {
		System.out.println("I'm flying in a short distance");
	}
	
}