package com.jockey.TemplateMethodPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffeineBeverageWithHook {

	@Override
	public void brew() {
		System.out.println("Dripping Coffee through filter");
	}

	@Override
	public void addCondiments() {
		System.out.println("Adding Sugar and Milk");
	}
	
	@Override
	public boolean customerWantsCondiments() {
		String answer = getUserInput();
		
		if(answer.toLowerCase().startsWith("y")) {
			return true;
		}else {
			return false;
		}
	}

	private String getUserInput() {
		System.out.println("Would you like sugar and milk with your coffee (y/n) ?");
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String answer = null;
		try {
			 answer = in.readLine();
		} catch (IOException e) {
			System.err.println("IO error trying  to read your answer");
			e.printStackTrace();
		}
		
		if(answer == null) {
			return "no";
		}
		
		return answer;
	}

}
