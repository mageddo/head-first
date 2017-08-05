package com.mageddo.designpatterns.cap_09_2;

import java.util.ArrayList;
import java.util.Iterator;;

public class PancakeHouseMenu implements Menu{
	ArrayList menuItems;
	
	public PancakeHouseMenu(){
		menuItems = new ArrayList();
		
		addItem("K&B's Pancake Breakfast", "Pancake with scrambled eggs, and tosst", true, 2.99);
		addItem("Regular Pancake Breakfast", "Pancake with fried eggs, sausage", false, 2.99);
		addItem("BlueBerry Pancakes", "Pancake made with fresh blueberries", true, 3.49);
		addItem("Waffles", "Waffles with your choice of blueberries or strawberries", true, 3.59);
		
		
	}
	
	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem item = new MenuItem(name, description, vegetarian, price);
		menuItems.add(item);
		
	}
	
	public ArrayList getMenuItems() {
		return menuItems;
	}
	
	 public Iterator createIterator() {
		return menuItems.iterator();
	}
	
}
