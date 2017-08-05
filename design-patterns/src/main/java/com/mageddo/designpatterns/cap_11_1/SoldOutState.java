package com.mageddo.designpatterns.cap_11_1;

public class SoldOutState implements State{

	GumballMachine gumballMachine;
	
	public SoldOutState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuarter() {
		System.out.println("Voc� n�o pode colocar outra moeda");
		
	}

	@Override
	public void ejectQuarter() {
		System.out.println("Tirando moeda");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}

	@Override
	public void turnCrank() {
		System.out.println("Desculpe mas n�o existem gomas");
		
	}

	@Override
	public void dispense() {
		System.out.println("N�o existem gomas");
		
	}
	
	@Override
	public String toString() {
		return "Maquina vazia";
	}

}
