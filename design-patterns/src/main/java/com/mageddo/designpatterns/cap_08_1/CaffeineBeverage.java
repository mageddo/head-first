package com.mageddo.designpatterns.cap_08_1;

public abstract class CaffeineBeverage {
	final void prepareRecipe(){
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}

	public abstract void brew();
	public abstract void addCondiments();

	public final void boilWater() {
		System.out.println("Fervendo a �gua");
		
	}
	public final void pourInCup() {
		System.out.println("Colocando na x�cara");
		
	}

}
