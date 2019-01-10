package com.jockey.IteratorPattern;

public class Waitress {
	PancakeHouseMenu pancakeHouseMenu;
	DinerMenu dinerMenu;

	public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
		super();
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
	}

	public void printMenu() {
		Iterator pancakeHouseMenuIterator = pancakeHouseMenu.createIterator();
		Iterator dinerHouseMenuIterator = dinerMenu.createIterator();
		System.out.println("MENU\n----\nBREAKFAST");
		printMenu(pancakeHouseMenuIterator);
		System.out.println("\nLUNCH");
		printMenu(dinerHouseMenuIterator);
	}
	
	private void printMenu(Iterator iterator) {
		while (iterator.hasNext()) {
			MenuItem item = (MenuItem)iterator.next();
			System.out.print(item.getName() + " , ");
			System.out.print(item.getPrice() + " -- ");
			System.out.println(item.getDescription());
		}
	}
	

}
