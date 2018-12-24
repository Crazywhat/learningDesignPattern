package com.jockey.DecoratorPattern;

public abstract class Beverage {
	protected String description = "Unknown Beverage";
	public enum SizeChoice {tall,grande,venti};
	protected SizeChoice sizeChoice = SizeChoice.grande;
	
	public SizeChoice getSizeChoice() {
		return sizeChoice;
	}

	public void setSizeChoice(SizeChoice sizeChoice) {
		this.sizeChoice = sizeChoice;
	}

	public String getDescription() {
		return description;
	}
	
	public abstract double cost();
}

class Espresso extends Beverage{

	public Espresso() {
		description = "Esprsso";
	}
	
	@Override
	public double cost() {
		return 1.99;
	}
	
}

class DarkRoast extends Beverage{

	public DarkRoast() {
		description = "DarkRoast";
	}
	
	@Override
	public double cost() {
		return .99;
	}
	
}

//Decaf
class Decaf extends Beverage{

	public Decaf() {
		description = "Decaf";
	}
	
	@Override
	public double cost() {
		return 1.05;
	}
	
}

//HouseBlend
class HouseBlend  extends Beverage{

	public HouseBlend() {
		description = "HouseBlend";
	}
	
	@Override
	public double cost() {
		return .89;
	}
	
}