package com.mageddo.designpatterns.cap_10_2;

public class GumballMachine {
	State soldOutState;
	State soldState;
	State noQuarterState;
	State hasQuarterState;
	State winnerState;
	
	State state = soldOutState;
	
	int count = 0;
	
	public GumballMachine(int numberOfGumballs) {
		//soldOutState = new this
		noQuarterState = new NoQuarterState(this);
		soldOutState = new SoldOutState(this);
		soldState = new SoldState(this);
		hasQuarterState = new HasQuarterState(this);
		winnerState = new WinnerState(this);
		
		this.count = numberOfGumballs;
		if(numberOfGumballs > 0){
			state  = noQuarterState;
		}
	}
	
	
	public void insertQuarter(){
		state.insertQuarter();
	}
	
	public void ejectQuarter(){
		state.ejectQuarter();
	}
	public void turnCrank(){
		state.turnCrank();
		state.dispense();
	}
	
	public void releaseBall(){
		System.out.println("Uma goma vai ser jogada pra fora");
		
		if(count != 0 )
			count--;
	}
	
	public State getSoldOutState() {
		return soldOutState;
	}

	public State getSoldState() {
		return soldState;
	}

	public State getHasQuarterState() {
		return hasQuarterState;
	}
	
	public State getWinnerState() {
		return winnerState;
	}
	public State getNoQuarterState() {
		return noQuarterState;
	}

	public void setState(State state){
		this.state = state;
	}
	
	@Override
	public String toString() {
		return "\nESTADO: " + state + " | GOMAS: " + count + "\n\n"; 
	}
}
