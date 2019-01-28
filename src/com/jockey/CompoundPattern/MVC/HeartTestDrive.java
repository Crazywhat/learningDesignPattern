package com.jockey.CompoundPattern.MVC;

public class HeartTestDrive {

	public static void main(String[] args) {
	
		HeartModel heartModel = new HeartModel();
		ControllerInterface controller = new HeartController(heartModel);

	}

}
