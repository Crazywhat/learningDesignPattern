package com.jockey.CompoundPattern.multiPatternUseExample;


public class DuckSimulator {

	public static void main(String[] args) {
			DuckSimulator duckSimulator = new DuckSimulator();
			AbstractDuckFactory factory = new CountingDuckFactory();
			duckSimulator.simulate(factory);
	}
	
	void simulate(AbstractDuckFactory factory) {
		Quackable mallardDuck = factory.createMallardDuck();
		Quackable redheadDuck = factory.createRedheadDuck(); 
		Quackable duckCall = factory.createDuckCall(); 
		Quackable rubberDuck = factory.createRubberDuck(); 
		Quackable gooseDuck = new GooseAdapter(new Goose());
	
		
		Flock flockOfDucks = new Flock();
		
		flockOfDucks.add(mallardDuck);
		flockOfDucks.add(redheadDuck);
		flockOfDucks.add(duckCall);
		flockOfDucks.add(rubberDuck);
		flockOfDucks.add(gooseDuck);

		Flock flockOfMallards = new Flock();
		
		Quackable mallardOne = factory.createMallardDuck();
		Quackable mallardTwo = factory.createMallardDuck();
		Quackable mallardThree = factory.createMallardDuck();
		Quackable mallardFour = factory.createMallardDuck();

		flockOfMallards.add(mallardOne);
		flockOfMallards.add(mallardTwo);
		flockOfMallards.add(mallardThree);
		flockOfMallards.add(mallardFour);
	
		flockOfDucks.add(flockOfMallards);
		
		System.out.println("\nDuck Simulator: With Observer");
		
		Quackologist quackologist = new Quackologist();
		flockOfDucks.registerObserver(quackologist);
		
		simulate(flockOfDucks);
		
		System.out.println("\nThe ducks quacked " +
							QuackCounter.getNumberOfQuacks() +
							" times");
	}
	
	void simulate(Quackable duck) {
		duck.quack();
	}
}
