package com.mageddo.designpatterns.cap_06_2;

public class CeilingFan {
	static final int HIGH = 3;
	static final int MEDIUM = 2;
	static final int LOW = 1;
	static final int OFF = 0;
	private int speed;
	private String location;
	
	
	public CeilingFan(String location) {
		this.location = location;
		setSpeed(OFF);
	}
	
	public void high(){
		setSpeed(HIGH);
		
		// manipulando pelo hardware
	}
	
	public void medium() {
		setSpeed(MEDIUM);

		// manipulando pelo hardware
	}
	
	public void low() {
		setSpeed(LOW);
		
		// manipulando pelo hardware
	}
	
	public void off() {
		setSpeed(OFF);
		
		// manipulando pelo hardware
	}
	
	
	// seta as velocidades e monitora os eventos
	private void setSpeed(int speed){
		this.speed = speed;
		switch (speed) {
		case 3:
			System.out.println("Velocidade alta");
			break;
		case 2:
			System.out.println("Velocidade m�dia");
			break;
		case 1:
			System.out.println("Velocidade baixa");
			break;
		case 0:
			System.out.println("Desligar");
			break;

		default:
			System.out.println("Desligar");
			break;
		}
	}
	
	// retorna a velocidade atual
	public int getSpeed() {
		return speed;
	}
}
