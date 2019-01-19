package com.jockey.IteratorPattern;


import java.util.ArrayList;

public class PancakeHouseMenu implements Menu{
	ArrayList<MenuItem> menuItems;
	
	public PancakeHouseMenu() {
		super();
		menuItems = new ArrayList<MenuItem>();
		
		addItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99);
		addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, and sausage", false, 2.99);
		addItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49);
		addItem("Waffles", "Waffles, with your choice of blueberries or strawberries", true, 3.59);
	}


	public void addItem(String name,String description,boolean vegetarian,double price) {
		MenuItem item = new MenuItem(name, description, vegetarian, price);
		menuItems.add(item);
	}


	public ArrayList<MenuItem> getMenuItems() {
		return menuItems;
	} 
	
	public Iterator createIterator() {
		return new PancakeHouseMenuIterator(menuItems);
	}
	

	@Override
	public java.util.Iterator createJavaUtilIterator() {
		// TODO Auto-generated method stub
		return menuItems.iterator();
	}
	
}
