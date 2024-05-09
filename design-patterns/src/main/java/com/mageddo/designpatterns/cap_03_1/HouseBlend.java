package com.mageddo.designpatterns.cap_03_1;

public class HouseBlend extends Beverage{
	public HouseBlend() {
		description = "Expresso";
	}
	
	@Override
	public double cost() {
		return .89;
	}
}
