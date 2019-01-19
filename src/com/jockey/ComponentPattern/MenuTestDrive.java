package com.jockey.ComponentPattern;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

import com.jockey.IteratorPattern.DinerMenu;

public class MenuTestDrive {

	public static void main(String[] args) {
		
		MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
		MenuComponent dineMenu = new Menu("DINER MENU", "Lunch");
		MenuComponent cafeMenu = new Menu("CAFE MENU", "DINNER1"); 
		MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert of course!");
		
		MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");
		
		
		allMenus.add(pancakeHouseMenu);
		allMenus.add(dineMenu);
		allMenus.add(cafeMenu);
		
		dineMenu.add(new MenuItem("Vegetarian BLT","(Fakin') Bacon with lettuce & tomato on whole wheat",true,2.99));
		dineMenu.add(new MenuItem("BLT","Bacon with lettuce & tomato on whole wheat",false,2.99));
		dineMenu.add(new MenuItem("Soup of the day","Soup of the day, with a side of potato salad",false,3.29));
		dineMenu.add(new MenuItem("Hotdog","A hot dog, with saurkraut, relish, onions, topped with cheese",false,3.05)); 
		
		dineMenu.add(dessertMenu);
		
		dessertMenu.add(new MenuItem("Apple Pie", "Apple pie with a flakey crust, topped with vanilla ice cream", true, 1.59));
		
		pancakeHouseMenu.add(new MenuItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99));
		pancakeHouseMenu.add(new MenuItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49));
		pancakeHouseMenu.add(new MenuItem("Waffles", "Waffles, with your choice of blueberries or strawberries", true, 3.59));
		
		cafeMenu.add(new MenuItem("Veggie Burger and Air Fries", "Veggie burger on a whole wheat bun, lettuce, tomato, and fries", true, 3.99));
		cafeMenu.add(new MenuItem("Soup of the day", "A cup of the soup of the day, with a side salad", false, 3.69));
		cafeMenu.add(new MenuItem("Burrito", "A large burrito, with whole pinto beans, salsa, guacamole", true, 4.29));

		Waitress waitress = new Waitress(allMenus);
		//waitress.printMenu();
		waitress.printVegetarianMenu();
	}
}