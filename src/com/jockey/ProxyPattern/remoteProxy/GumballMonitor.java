package com.jockey.ProxyPattern.remoteProxy;

import java.rmi.RemoteException;

public class GumballMonitor {
	GumballMachineRemote machine;

	public GumballMonitor(GumballMachineRemote machine) {
		super();
		this.machine = machine;
	}
	
	public void report() {
		try {
			System.out.println("\nGumball Machine: " + machine.getLocation());
			System.out.println("Current inventory: " + machine.getCount());
			System.out.println("Current state: " + machine.getCurrentState());
			System.out.println();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
}
