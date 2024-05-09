package com.mageddo.designpatterns.cap_09_1;

public class MenuTestDrive {
	public static void main(String[] args) {
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		DinnerMenu dinnerMenu = new DinnerMenu();
		
		WaiTress waiTress = new WaiTress(pancakeHouseMenu, dinnerMenu);
		
		waiTress.printMenu();
	}
}
