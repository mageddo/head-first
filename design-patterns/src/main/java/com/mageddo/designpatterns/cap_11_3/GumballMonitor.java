package com.mageddo.designpatterns.cap_11_3;

import java.rmi.RemoteException;

public class GumballMonitor {
	GumballMachineRemote machine;
	int last = 0;
	
	
	public GumballMonitor(GumballMachineRemote machine) {
		this.machine = machine;
	}
	
	public void report() {
		try {
			System.out.println("M�quina de goma: " + machine.getLocation());
			System.out.println("Quantidade no estoque: " + machine.getCount());
			System.out.println("Estado: " + machine.getState());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public boolean mudou() throws RemoteException{
		if(machine.getCount() != last){
			last = machine.getCount();
			return true;
		}
		else{
			return false;
		}
	}
}
