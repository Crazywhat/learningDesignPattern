package com.jockey.DecoratorPattern;

import com.jockey.DecoratorPattern.Beverage.SizeChoice;

public class StarbuzzCoffee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Beverage beverage0 = new Espresso();
		System.out.println(beverage0.getDescription() + " $" 
								+ String.format("%.2f", beverage0.cost()));
		
		Beverage beverage1 = new DarkRoast();
		beverage1 = new Mocha(beverage1);
		beverage1 = new Mocha(beverage1);
		beverage1 = new Whip(beverage1);
		System.out.println(beverage1.getDescription() + " $" 
							+ String.format("%.2f", beverage1.cost()));
		
		Beverage beverage2 = new HouseBlend();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Milk(beverage2);
		beverage2 = new Whip(beverage2);
		beverage2 = new Soy(beverage2);
		System.out.println(beverage2.getDescription() + " $" 
							+ String.format("%.2f", beverage2.cost()));
		
		Beverage beverage3 = new HouseBlend();
		beverage3.setSizeChoice(SizeChoice.tall);
		beverage3 = new Mocha(beverage3);
		System.out.println(beverage3.getDescription() + " $" 
				+ String.format("%.2f", beverage3.cost()));
		
		Beverage beverage4 = new HouseBlend();
		beverage4.setSizeChoice(SizeChoice.grande);
		beverage4 = new Mocha(beverage4);
		System.out.println(beverage4.getDescription() + " $" 
				+ String.format("%.2f", beverage4.cost()));
		
		Beverage beverage5 = new HouseBlend();
		beverage5.setSizeChoice(SizeChoice.venti);
		beverage5 = new Mocha(beverage5);
		System.out.println(beverage5.getDescription() + " $" 
				+ String.format("%.2f", beverage5.cost()));
		
	}

}
