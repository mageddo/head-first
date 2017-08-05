package com.mageddo.designpatterns.cap_11_1;

public class GumballMonitor {
	GumballMachine machine;
	
	public GumballMonitor(GumballMachine machine) {
		this.machine = machine;
	}
	
	public void report() {
		System.out.println("M�quina de goma: " + machine.getLocation());
		System.out.println("Quantidade no estoque: " + machine.getCount());
		System.out.println("Estado: " + machine.getState());

	}
}
