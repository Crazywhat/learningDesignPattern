package com.jockey.StatePattern;

public class GumballMachine {
	private State soldOutState;
	private State soldState;
	private State noQuarterState;
	private State hasQuarterState;
	private State winnerState;
	
	private State currentState = noQuarterState;
	private int count = 0;
	
	public GumballMachine(int numberGumballs) {
		soldOutState = new SoldOutState(this);
		soldState = new SoldState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		winnerState = new WinnerState(this);
		this.count = numberGumballs;
		if (numberGumballs > 0) {
			this.currentState = noQuarterState;
		}
	}
	
	public void refill(int refillNumber) {
		if (refillNumber > 0) {
			count += refillNumber;
			this.currentState = noQuarterState;
		}
	}
	
	public void insertQuarter() {
		currentState.insertQuarter();
	}
	
	public void ejectQuarter() {
		currentState.ejectQuarter();
	}
	
	public void turnCrank() {
		currentState.turnCrank();
		currentState.dispense();
	}
	
	
	public void setState(State state) {
		currentState = state;
	}
	
	public void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if (count != 0) {
			--count;
		}
	}
	
	public State getHasQuarterState() {
		return hasQuarterState;
	}
	
	public State getNoQuarterState() {
		return noQuarterState;
	}
	
	public State getSoldState() {
		return soldState;
	}
	
	public State getSoldOutState() {
		return soldOutState;
	}
	
	public State getWinnerState() {
		return winnerState;
	}

	public int getCount() {
		return count;
	}

	@Override
	public String toString() {
		return "\nMighty Gumball, Inc.\nJava-enabled Standing Gumball Model #2004\nInventory: "
				+ count + " guballs\n"
				+ (count == 0 ? "Machine is sold out":"Machine is waiting for quarter")
				+ "\n\n";
	}
	
}
