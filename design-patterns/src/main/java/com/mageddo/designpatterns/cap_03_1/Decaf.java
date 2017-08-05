package com.mageddo.designpatterns.cap_03_1;

public class Decaf extends Beverage{
	public Decaf() {
		description = "Descafeinado";
	}
	
	@Override
	public double cost() {
		return 1.05;
	}
}
