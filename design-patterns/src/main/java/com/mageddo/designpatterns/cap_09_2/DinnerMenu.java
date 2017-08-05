package com.mageddo.designpatterns.cap_09_2;

import java.util.Iterator;

public class DinnerMenu implements Menu{

	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	
	MenuItem[] menuItems;
	
	public DinnerMenu() {
		menuItems = new MenuItem[MAX_ITEMS];
		
		addItem("Vegetarian BLT", "('Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99);
		addItem("BLT", "Bacon with lettuce & tomato on whole wheat", false, 2.99);
		addItem("Soup of day", "Soup of day, with a side of potato salad", false, 3.99);
		addItem("Hot Dog", "A hot dog withsaurkraut, relish, onions, topped with cheese", false, 3.05);
		
	}
	
	
	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem item = new MenuItem(name, description, vegetarian, price);
		
		if(numberOfItems >= MAX_ITEMS)
			System.out.println("Sorry, menu is full");
		menuItems[numberOfItems] = item;
		numberOfItems++;
	}
	
	public Iterator createIterator(){
		return new DinnerMenuIterator(menuItems);
	}
	
}
