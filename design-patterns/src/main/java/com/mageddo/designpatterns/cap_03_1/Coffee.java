package com.mageddo.designpatterns.cap_03_1;

public class Coffee extends Beverage {
	
	public Coffee() {
		description = "Caf� padr�o";
	}
	
	@Override
	public double cost() {
		return .99;
	}
}
