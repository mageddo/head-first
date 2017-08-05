package com.mageddo.designpatterns.cap_11_1;

public class SoldState implements State{

	GumballMachine gumballMachine;
	
	public SoldState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuarter() {
		System.out.println("Por favor aguarde, nos estamos pegando sua goma");
		
	}

	@Override
	public void ejectQuarter() {
		System.out.println("Desculpe, voc� j� puxou a alavanca");
		
	}

	@Override
	public void turnCrank() {
		System.out.println("Desculpe, sua goma j� est� sendo trazida");
		
	}

	@Override
	public void dispense() {
		gumballMachine.releaseBall();
		
		if(gumballMachine.getCount() > 0){
			
			gumballMachine.setState(gumballMachine.noQuarterState);
			
		}else{
			System.out.println("Desculpe acabaram as gomas");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
		
		
	}
	
	@Override
	public String toString() {
		return "Preparando goma";
	}
	
}
