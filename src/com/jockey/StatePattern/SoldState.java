package com.jockey.StatePattern;

public class SoldState implements State {

	GumballMachine gumballMachine;
	
	public SoldState(GumballMachine gumballMachine) {
		super();
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuarter() {
		System.out.println("Please wait, We're already giving you a gumball.");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("Sorry, you already turned the crank.");
	}

	@Override
	public void turnCrank() {
		System.out.println("Turning twice doesn't get you another gumball!");
	}

	@Override
	public void dispense() {
		gumballMachine.releaseBall();
		if (gumballMachine.getCount() == 0) {
			System.out.println("Oops, out of gumballs!");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}else {
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		}
	}

}