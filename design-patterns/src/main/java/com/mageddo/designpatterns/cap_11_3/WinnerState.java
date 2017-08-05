package com.mageddo.designpatterns.cap_11_3;

public class WinnerState implements State{

	transient GumballMachine gumballMachine;
	
	public WinnerState(GumballMachine gumballMachine) {
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

		if(gumballMachine.getCount() == 0){
			gumballMachine.setState(gumballMachine.getSoldOutState());
			
		}
		else{
			System.out.println("Voc� � um vencedor! Voce ganhou duas gomas");
			
			gumballMachine.releaseBall();
			
			if(gumballMachine.getCount() == 0){
				// nunca deve acontecer
				System.out.println("Infelizmente n�o temos mais gomas para dar o seu brinde.. mostre isso ao gerente");
			}else{
				gumballMachine.releaseBall();
			}
			
			if(gumballMachine.getCount() > 0){
				
				gumballMachine.setState(gumballMachine.noQuarterState);
				
			}else{
				System.out.println("Desculpe acabaram as gomas");
				gumballMachine.setState(gumballMachine.getSoldOutState());
			}
			
		}
		
		
		
	}
	
	@Override
	public String toString() {
		return "Maquina vazia";
	}
}
