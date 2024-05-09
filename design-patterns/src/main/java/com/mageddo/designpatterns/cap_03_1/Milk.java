package com.mageddo.designpatterns.cap_03_1;

public class Milk extends CondimentDecorator {

	Beverage beverage;
	
	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}
	@Override
	public double cost() {
		return .20 + beverage.cost();
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Leite com espuma";
	}

}
