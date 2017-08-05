package com.mageddo.designpatterns.cap_09_3;

import java.util.Iterator;;

public class WaiTress {
	Menu pancakeHouseMenu;
	Menu dinnerMenu;
	Menu coffeeMenu;
	
	public WaiTress(Menu  pancakeHouseMenu, Menu dinnerMenu, Menu coffeeMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinnerMenu = dinnerMenu;
		this.coffeeMenu = coffeeMenu;
	}
	
	public void printMenu(){
		Iterator paIterator = pancakeHouseMenu.createIterator();
		Iterator diIterator = dinnerMenu.createIterator();
		Iterator coIterator = coffeeMenu.createIterator();
		
		System.out.println("MENU \n ----- \n BREAKFAST");
		printMenu(paIterator);
		System.out.println("\nLUNCH");
		printMenu(diIterator);
		System.out.println("\nDINNER");
		printMenu(coIterator);
		
	}
	
	private void printMenu(Iterator iterator){
		while(iterator.hasNext()){
			MenuItem menuItem = (MenuItem) iterator.next(); 
			System.out.print(menuItem.getName() + ", ");
			System.out.print(menuItem.getPrice() + " -- ");
			System.out.println(menuItem.getDescription());
		}
	}
}
