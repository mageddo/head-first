package com.mageddo.designpatterns.cap_11_1;

public class GumballMachineTestDrive {
	public static void main(String[] args) {
		
		String localizacao = "Morumbi";
		int qtd = 5;
		
		
		GumballMachine gumballMachine = new GumballMachine(localizacao, qtd);

		// gerando relatorio
		GumballMonitor gumballMonitor = new GumballMonitor(gumballMachine);
		gumballMonitor.report();
		
		System.out.println(gumballMachine);
		
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		
		System.out.println(gumballMachine);
		
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		
		System.out.println(gumballMachine);
		
		
		
		
		
	}
}	
