package com.jockey.AdapterPattern;

public class DuckTestDrive {

	public static void main(String[] args) {
		
		MallardDuck duck = new MallardDuck();
		
		WildTurkey turkey = new WildTurkey();
		Duck turkeyAdapter = new TurkeyAdapter(turkey);
		
		System.out.println("The duck says :");
		duck.quack();
		duck.fly();
		
		System.out.println("\nThe turkey says :");
		turkey.gobble();
		turkey.fly();
		
		System.out.println("\nThe turkeyAdapter says :");
		testDuck(turkeyAdapter);
	}
	
	private static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}

}
