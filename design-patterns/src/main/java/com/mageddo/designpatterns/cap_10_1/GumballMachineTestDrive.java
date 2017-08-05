package com.mageddo.designpatterns.cap_10_1;

public class GumballMachineTestDrive {
	public static void main(String[] args) {
		GumballMachine machine = new GumballMachine(5);
		
		System.out.println(machine);
		
		machine.insertQuarter();
		machine.turnCranck();
		
		System.out.println(machine);
		
		machine.insertQuarter();
		machine.ejectQuarter();
		machine.turnCranck();
		
		System.out.println(machine);
		
		machine.insertQuarter();
		machine.turnCranck();
		machine.insertQuarter();
		machine.turnCranck();
		
		
		machine.ejectQuarter();
		
		System.out.println(machine);
		
		machine.insertQuarter();
		machine.insertQuarter();
		machine.turnCranck();
		machine.insertQuarter();
		machine.turnCranck();
		machine.insertQuarter();
		machine.turnCranck();
		
		System.out.println(machine);
		
	}
}
