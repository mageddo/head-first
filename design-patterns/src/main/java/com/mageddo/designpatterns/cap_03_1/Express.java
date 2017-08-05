package com.mageddo.designpatterns.cap_03_1;

public class Express extends Beverage {

	public Express() {
		description = "Expresso";
	}
	
	@Override
	public double cost() {
		return 1.99;
	}

}
