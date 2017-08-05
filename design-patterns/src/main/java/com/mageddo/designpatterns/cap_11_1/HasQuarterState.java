package com.mageddo.designpatterns.cap_11_1;

import java.util.Random;

public class HasQuarterState implements State{

	GumballMachine gumballMachine;
	Random randomWinner = new Random(System.currentTimeMillis());
	
	public HasQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuarter() {
		System.out.println("Voce n�o pode colocar outra moeda j� existe uma moeda colocada");
		
	}

	@Override
	public void ejectQuarter() {
		System.out.println("Ejetando moeda que estava dentro da maquina");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
		
	}

	@Override
	public void turnCrank() {
		System.out.println("Voce tentou...");
		
		int winner = randomWinner.nextInt(11);
		
		if(winner == 10 &&  gumballMachine.getCount() > 1) 
			gumballMachine.setState(gumballMachine.getWinnerState());
		else
			gumballMachine.setState(gumballMachine.getSoldState());
		
	}

	@Override
	public void dispense() {
		System.out.println("Sem gomas para dispensar");
		
	}

	@Override
	public String toString() {
		return "Com moeda";
	}
}
