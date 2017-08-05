package com.mageddo.designpatterns.cap_03_1;

public class CafeteriaTest {
	public static void main(String[] args) {
		
		// Fazendo uma nova bebida 
		
		// menu
		/*  ==> Escolha um tipo de bebida
		 *	Coffee
		 *	Decaf
		 *	Express
		 *	HouseBlend 
		 */
		Beverage bebida = new Express();
		
		/*
		 * ==> Escolha um condimento para a bebida
		 * Mocha
		 * Milk
		 * Soy
		 * Whip
		 * 
		 * */
		// colocando cafe
		bebida = new Mocha(bebida);
		
		// colocando mais um condimento
		bebida = new Milk(bebida);
		
		System.out.println("Pedido: "+bebida.getDescription());
		System.out.println("Pre�o: "+bebida.cost());
		
		
	}
}
