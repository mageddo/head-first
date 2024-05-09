package com.mageddo.designpatterns.cap_09_4;

public class MenuTestDrive {
	public static void main(String[] args) {
		
		MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU ", "Breakfast");
		MenuComponent dinnerMenu = new Menu("DINNER MENU ", "Lunch");
		MenuComponent coffeeMenu = new Menu("COFFEE MENU ", "Dinner");
		MenuComponent dessetMenu = new Menu("DESSERT MENU ", "Desert of course!");
		
		MenuComponent allMenus = new Menu("All Menus", "Todos os menus combinados");
		
		allMenus.add(pancakeHouseMenu);
		allMenus.add(dinnerMenu);
		allMenus.add(coffeeMenu);

		
		dinnerMenu.add(new MenuItem("Pasta",
				"Spaghetti with Marianara Sauce, and a slice of a sourdough bread",
				true,
				3.89));
		
		dinnerMenu.add(dessetMenu);
		
		dessetMenu.add(new MenuItem("Apple Pie",
				"Apple pie with a flakey crust, topped with vanilla ice cream",
				true,
				1.59));
		
		// acrescentar outros
		
		pancakeHouseMenu.add(new MenuItem("K&B's Pancake Breakfast",
				"Pancake with scrambled eggs, and tosst",
				true,
				2.99));
		
		coffeeMenu.add(new MenuItem("Veggie and Air Fries",
				"Veggie burger on a whole wheat bun, lettuce, tomato, and fries",
				true, 3.99));
		
		// chamando a garconete para fazer o "trabalho duro"
		
		WaiTress waiTress = new WaiTress(allMenus);
		waiTress.printMenu();
	}
}
