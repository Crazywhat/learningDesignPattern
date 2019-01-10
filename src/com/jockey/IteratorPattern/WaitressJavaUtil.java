package com.jockey.IteratorPattern;

public class WaitressJavaUtil {
	Menu pancakeHouseMenu;
	Menu dinerMenu;

	public WaitressJavaUtil(Menu pancakeHouseMenu, Menu dinerMenu) {
		super();
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
	}

	public void printMenu() {
		java.util.Iterator pancakeHouseMenuIterator = pancakeHouseMenu.createJavaUtilIterator();
		java.util.Iterator dinerHouseMenuIterator = dinerMenu.createJavaUtilIterator();
		System.out.println("MENU\n----\nBREAKFAST");
		printMenu(pancakeHouseMenuIterator);
		System.out.println("\nLUNCH");
		printMenu(dinerHouseMenuIterator);
	}
	
	private void printMenu(java.util.Iterator iterator) {
		while (iterator.hasNext()) {
			MenuItem item = (MenuItem)iterator.next();
			System.out.print(item.getName() + " , ");
			System.out.print(item.getPrice() + " -- ");
			System.out.println(item.getDescription());
		}
	}
	

}
