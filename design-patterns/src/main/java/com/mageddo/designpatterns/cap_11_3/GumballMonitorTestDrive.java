package com.mageddo.designpatterns.cap_11_3;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;



public class GumballMonitorTestDrive {
	public static void main(String[] args) throws RemoteException {
		List monitors = new ArrayList();
		
		for (int i = 0; i < 3; i++) {
			try {
				GumballMachineRemote machine = (GumballMachineRemote) Naming.lookup("rmi://127.0.0.1/gumballMachine");
				monitors.add(new GumballMonitor(machine));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		while (true) {
			for (int j = 0; j < monitors.size(); j++) {
				
				GumballMonitor m = (GumballMonitor) monitors.get(j);
				if(m.mudou()){
					m.report();
					System.out.println("\n---------------------\n");
				}
			}
		}
		
	}
}
