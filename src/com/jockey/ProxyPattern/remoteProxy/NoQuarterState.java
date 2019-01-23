package com.jockey.ProxyPattern.remoteProxy;

public class NoQuarterState implements State {
	transient GumballMachine gumballMachine;
	
	private static final long serialVersionUID = 1L;
	
	public NoQuarterState(GumballMachine gumballMachine) {
		super();
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuarter() {
		System.out.println("You insert a quarter.");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}

	@Override
	public void ejectQuarter() {
		System.out.println("You haven't inserted a quarter.");
	}

	@Override
	public void turnCrank() {
		System.out.println("You turned but there's no quarter.");
	}

	@Override
	public void dispense() {
		System.out.println("You need to pay first");
	}
	
	@Override
	public String toString() {
		return "NoQuarterState";
	}

}
