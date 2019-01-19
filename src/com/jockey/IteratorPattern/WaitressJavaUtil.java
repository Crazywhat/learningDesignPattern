package com.jockey.IteratorPattern;

import java.util.ArrayList;
import java.util.Iterator;

public class WaitressJavaUtil {
	ArrayList<Menu> menus;
	
	public WaitressJavaUtil(ArrayList<Menu> menus) {
		super();
		this.menus = menus;
	}
	
	public void printMenu() {
		for (Menu menu : menus) {
			
			if (menu instanceof DinerMenu) {
				printMenu(((DinerMenu) menu).createAlternatingIterator());
			}else {
				printMenu(menu.createJavaUtilIterator());
			}
			System.out.println();
		}
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
