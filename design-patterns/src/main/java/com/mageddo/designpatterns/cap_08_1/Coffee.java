package com.mageddo.designpatterns.cap_08_1;

public class Coffee extends CaffeineBeverage{



	public void addSugarAnMilk() {
		System.out.println("Adicionando a��car e leite");
	}

	
	public void brewCoffeeGrinds() {
		System.out.println("Colocando p� de caf� na agua");
	}

	

	@Override
	public void brew() {
		brewCoffeeGrinds();
		
	}

	@Override
	public void addCondiments() {
		addSugarAnMilk();
	}

}
