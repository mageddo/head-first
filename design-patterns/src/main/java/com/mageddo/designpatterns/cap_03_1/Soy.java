package com.mageddo.designpatterns.cap_03_1;

public class Soy extends CondimentDecorator {
	Beverage beverage;
	
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}
	@Override
	public double cost() {
		return .15 + beverage.cost();
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Soja";
	}

}
