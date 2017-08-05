package com.mageddo.designpatterns.cap_09_2;

import java.util.Iterator;;

public class WaiTress {
	Menu pancakeHouseMenu;
	Menu dinnerMenu;
	
	public WaiTress(Menu  pancakeHouseMenu, Menu dinnerMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinnerMenu = dinnerMenu;
	}
	
	public void printMenu(){
		Iterator paIterator = pancakeHouseMenu.createIterator();
		Iterator diIterator = dinnerMenu.createIterator();
		
		System.out.println("MENU \n ----- \n BREAKFAST");
		printMenu(paIterator);
		System.out.println("\nLUNCH");
		printMenu(diIterator);
		
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
