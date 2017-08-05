package com.mageddo.designpatterns.cap_03_1;

public abstract class Beverage {
	protected String description = "Descri��o desconhecida";
	
	public abstract double cost();

	public String getDescription() {
		return description;
	}

	
}
