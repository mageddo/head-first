package com.mageddo.designpatterns.cap_10_2;

public class NoQuarterState implements State{
	GumballMachine gumballMachine;
	
	public NoQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuarter() {
		System.out.println("Voc� colocou uma moeda");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}

	@Override
	public void ejectQuarter() {
		System.out.println("Voce nao colocou uma moeda ent�o nao pode tira-la");
		
		
	}

	@Override
	public void turnCrank() {
		System.out.println("Voce tentou, mas n�o foram colocadas moedas");
		
	}

	@Override
	public void dispense() {
		System.out.println("Voce precisa pargar primeiro");
		
	}

	@Override
	public String toString() {
		return "Sem moeda";
	}
}
