package com.jockey.ProxyPattern.remoteProxy;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class GumballMonitorTestDrive {
	public static void main(String[] args) {
		String[] locations = {
				"rmi://127.0.0.1/santage-gumballmachine",
				"rmi://127.0.0.1/boulder-gumballmachine",
				"rmi://127.0.0.1/seattle-gumballmachine"
			};
		
		GumballMonitor[] monitors = new GumballMonitor[locations.length];
		
		for (int i = 0; i < locations.length ; i++) {
			
			GumballMachineRemote machine;
			try {
				machine = (GumballMachineRemote)Naming.lookup(locations[i]);
				monitors[i] = new GumballMonitor(machine);
				System.out.println(monitors[i]);
			} catch (MalformedURLException | RemoteException | NotBoundException e) {
				e.printStackTrace();
			}
		}
		
		for (int i = 0; i < monitors.length; i++) {
			monitors[i].report();
		}
	}
}
