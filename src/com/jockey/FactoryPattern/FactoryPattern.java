package com.jockey.FactoryPattern;

import java.util.ArrayList;


public class FactoryPattern {

	public static void main(String[] args) {
		
		FactoryPattern example = new FactoryPattern();
		PizzaStore nyStore = example.new NYStylePizzaStore();
		PizzaStore chicagoStore = example.new ChicagoStylePizzaStore();
		
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Ethan ordered a " + pizza.getName() + ".\n");

		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("Joel ordered a " + pizza.getName() + ".\n");
	}

abstract class PizzaStore{
	public Pizza orderPizza(String pizzaType) {
		Pizza pizza = createPizza(pizzaType);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
	protected abstract Pizza createPizza(String pizzaType);
}

class ChicagoStylePizzaStore extends PizzaStore{

	@Override
	public Pizza createPizza(String pizzaType) {
		Pizza pizza = null;
		switch (pizzaType) {
		case "cheese": pizza = new ChicagoStyleCheesePizza();break;
		case "clam": pizza = new ChicagoStyleClamPizza();break;
		default:break;
		}
		return pizza;
	}
}

class NYStylePizzaStore extends PizzaStore{

	@Override
	protected Pizza createPizza(String pizzaType) {
		Pizza pizza = null;
		switch (pizzaType) {
		case "cheese": pizza = new NYStyleCheesePizza();break;
		case "clam": pizza = new NYStyleClamPizza();break;
		default:break;
		}
		return pizza;
	}
}




abstract class Pizza{
	String name;
	String sauce;
	String dough;
	ArrayList<String> toppings = new ArrayList<String>();
	
	public void prepare() {
		System.out.println("Preparing " + name);
		System.out.println("Tossing dough...");
		System.out.println("Adding sauce...");
		System.out.println("Adding toppings :");
		for (String string : toppings) {
			System.out.println("\t" + string);
		}
	}
	
	
	public void bake() {
		System.out.println("Bake for 25 minutes at 350.");
	}
	public void cut()
	{
		System.out.println("Cutting the pizza into diagonal slices.");
	}
	public void box()
	{
		System.out.println("Place pizza in official pizzastore box.");
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
}
}

class NYStyleCheesePizza extends Pizza{
	public NYStyleCheesePizza(){
		name = "NY Style Sauce and Cheese Pizza";
		dough = "Thin Crist Dough";
		sauce = "Marinara Sauce";
		toppings.add("Shredded Mozzarella Cheese");
	}

}

class CAStyleCheesePizza extends Pizza{
	public CAStyleCheesePizza(){
		name = "CA Style Sauce and Cheese Pizza";
		dough = "No Dough";
		sauce = "Fresh Dog Shit Sauce";
		toppings.add("Sauce as more as possible");
	}

}

class CAStyleClamPizza extends Pizza{

	
}


class ChicagoStyleCheesePizza extends Pizza{
	public ChicagoStyleCheesePizza(){
		name = "Chicago Style Deep Dish Cheese Pizza";
		dough = "Extra Thick Crist Dough";
		sauce = "Plum Tomato Sauce";
		toppings.add("Grated Reggiano Cheese");
	}
	
	public void cut()
	{
		System.out.println("Cutting the pizza into square slices.");
	}

}



class ChicagoStyleClamPizza extends Pizza{

}

class NYStyleClamPizza extends Pizza{


}

}