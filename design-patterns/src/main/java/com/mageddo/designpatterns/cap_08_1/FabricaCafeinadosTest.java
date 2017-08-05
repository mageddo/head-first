package com.mageddo.designpatterns.cap_08_1;

public class FabricaCafeinadosTest {
	public static void main(String[] args) {
		Coffee coffee = new Coffee();
		Tea tea = new Tea();
		
		
		prepararCafeinado(coffee);
		System.out.println("\n\n");
		prepararCafeinado(tea);
		
	}
	
	public static void prepararCafeinado(CaffeineBeverage c){
		c.prepareRecipe();
	}
}
