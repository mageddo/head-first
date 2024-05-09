package com.mageddo.designpatterns.cap_09_3;

public class MenuTestDrive {
	public static void main(String[] args) {
		Menu pancakeHouseMenu = new PancakeHouseMenu();
		Menu dinnerMenu = new DinnerMenu();
		Menu coffeeMenu = new CoffeeMenu();
		
		WaiTress waiTress = new WaiTress(pancakeHouseMenu, dinnerMenu, coffeeMenu);
		
		waiTress.printMenu();
	}
}
