package com.jockey.IteratorPattern;

import java.util.ArrayList;

public class MenuTestDrive {

	public static void main(String[] args) {
	//	Waitress waitress = new Waitress(new PancakeHouseMenu(), new DinerMenu());
	//	waitress.printMenu();
		
		ArrayList<Menu> menus = new ArrayList<>();
		menus.add(new PancakeHouseMenu());
		menus.add(new DinerMenu());
		menus.add(new CafeMenu());
		
		WaitressJavaUtil waitress = new WaitressJavaUtil(menus);
		waitress.printMenu();
	
	}

}
