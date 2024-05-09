package com.mageddo.designpatterns.cap_08_1;

public abstract class CaffeineBeverageWithHook {
	final void prepareRecipe(){
		boilWater();
		brew();
		pourInCup();
		if(querCondimentos()){
			addCondiments();
		}
	}

	public boolean querCondimentos() {
		return true;
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
