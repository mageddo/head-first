package com.mageddo.designpatterns.cap_09_3;

import java.util.Hashtable;
import java.util.Iterator;

public class CoffeeMenu implements Menu{
	
	Hashtable menuitens = new Hashtable();
	
	
	public CoffeeMenu() {
		addItem("Veggie and Air Fries",
				"Veggie burger on a whole wheat bun, lettuce, tomato, and fries",
				true, 3.99);
		
		addItem("Soup of the day",
				"A cup of soup of the day, with a side salad",
				false, 3.69);
		
		addItem("Burrito",
				"A large burrito, with whole pinto benas, salsa, guacamole",
				true, 4.29);
	}
	
	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuitens.put(menuItem.getName(), menuItem);
	}
	
	@Override
	public Iterator createIterator() {
		return menuitens.values().iterator();
	}

}
