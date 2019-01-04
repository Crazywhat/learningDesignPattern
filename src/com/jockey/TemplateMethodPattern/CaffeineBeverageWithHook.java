package com.jockey.TemplateMethodPattern;

public abstract class CaffeineBeverageWithHook {

	public final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		if(customerWantsCondiments()) {
			addCondiments();
		}
	}
	
	public final void boilWater() {
		System.out.println("Boiling water");
	}

	public final void pourInCup() {
		System.out.println("Pouring into cup");
	}
	
	public abstract void brew();
	public abstract void addCondiments();
	
	public boolean customerWantsCondiments() {
		return true;
	}
}
