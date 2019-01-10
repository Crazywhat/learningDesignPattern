package com.jockey.IteratorPattern;

public class MenuTestDrive {

	public static void main(String[] args) {
	//	Waitress waitress = new Waitress(new PancakeHouseMenu(), new DinerMenu());
	//	waitress.printMenu();
		WaitressJavaUtil waitress = new WaitressJavaUtil(new PancakeHouseMenu(), new DinerMenu());
		waitress.printMenu();
	
	}

}
