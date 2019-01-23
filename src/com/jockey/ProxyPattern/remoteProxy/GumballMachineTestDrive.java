package com.jockey.ProxyPattern.remoteProxy;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class GumballMachineTestDrive {

	public static void main(String[] args) throws RemoteException {
		
		String[] locations = {"santage","boulder","seattle"};
		int[] initNums = {100,100,250};
		
		GumballMachine[] machines = new GumballMachine[locations.length];
		
		for (int i = 0; i < initNums.length; i++) {
			machines[i] = new GumballMachine(locations[i], initNums[i]);
			try {
				Naming.rebind(locations[i] + "-gumballmachine", machines[i]);
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("rebind over.");
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		machines[1].insertQuarter();
		machines[1].turnCrank();
		machines[1].insertQuarter();
		machines[1].turnCrank();
		
		
		System.out.println(machines[1]);
		
		
	}
}
