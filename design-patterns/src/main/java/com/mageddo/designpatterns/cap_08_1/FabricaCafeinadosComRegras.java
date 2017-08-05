package com.mageddo.designpatterns.cap_08_1;

public class FabricaCafeinadosComRegras {
	public static void main(String[] args) {
		CoffeeWithHook coffee = new CoffeeWithHook();

		prepararCafeinado(coffee);

	}
	
	public static void prepararCafeinado(CaffeineBeverageWithHook c){
		c.prepareRecipe();
	}
}
