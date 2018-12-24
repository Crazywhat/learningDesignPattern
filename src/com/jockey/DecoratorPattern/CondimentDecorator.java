package com.jockey.DecoratorPattern;

import java.util.HashMap;
import java.util.Map;

public abstract class CondimentDecorator extends Beverage {
	Beverage beverage;
	Map<Beverage.SizeChoice, Double> costBySize;
	public abstract String getDescription();

}

class  Mocha extends CondimentDecorator{

	public Mocha(Beverage beverage) {
		this.beverage = beverage;
		this.costBySize = new HashMap<Beverage.SizeChoice, Double>();
		this.costBySize.put(SizeChoice.tall,.15 );
		this.costBySize.put(SizeChoice.grande,.20 );
		this.costBySize.put(SizeChoice.venti,.25 );
	
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Mocha(" + beverage.getSizeChoice() + ")";
	}

	@Override
	public double cost() {
		return beverage.cost() + costBySize.get(beverage.getSizeChoice());
	}
	
}

class  Whip extends CondimentDecorator{

	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Whip(" + beverage.getSizeChoice() + ")";
	}

	@Override
	public double cost() {
		return beverage.cost() + .10;
	}
	
}



class  Soy extends CondimentDecorator{

	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Soy(" + beverage.getSizeChoice() + ")";
	}

	@Override
	public double cost() {
		return beverage.cost() + .15;
	}
	
}


class  Milk extends CondimentDecorator{

	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Milk(" + beverage.getSizeChoice() + ")";
	}

	@Override
	public double cost() {
		return beverage.cost() + .10;
	}
	
}

