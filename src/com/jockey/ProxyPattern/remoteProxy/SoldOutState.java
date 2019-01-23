package com.jockey.ProxyPattern.remoteProxy;

public class SoldOutState implements State {
	
	transient GumballMachine gumballMachine;

	private static final long serialVersionUID = 1L;
	
	public SoldOutState(GumballMachine gumballMachine) {
		super();
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuarter() {
		System.out.println("You can't insert a quarter, the machine is sold out.");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("You can't eject, you haven't inserted a quarter yet.");
	}

	@Override
	public void turnCrank() {
		System.out.println("You turned, but there are no gumballls.");
	}
	

	@Override
	public void dispense() {
		System.out.println("No gumball dispensed");
	}
	
	@Override
	public String toString() {
		return "SoldOutState";
	}

}
