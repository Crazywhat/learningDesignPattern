package com.jockey.FactoryPattern;

public class SimpleFactory {

	public static void main(String[] args) {
		
		SimpleFactory example = new SimpleFactory();
		SimplePizzaFactory factory = example.new SimplePizzaFactory();
		PizzaStore store = example.new PizzaStore(factory);
		store.orderPizza("cheesePizza");
		store.orderPizza("clamPizza");
	}

class PizzaStore{
	SimplePizzaFactory factory;
	
	public PizzaStore(SimplePizzaFactory factory) {
		super();
		this.factory = factory;
	}
	
	public Pizza orderPizza(String pizzaType) {
		Pizza pizza = factory.createPizza(pizzaType);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	
}

class SimplePizzaFactory{
	public Pizza createPizza(String pizzaType) {
		Pizza pizza = null;
		switch (pizzaType) {
		case "cheesePizza": pizza = new CheesePizza();break;
		case "clamPizza": pizza = new ClamPizza();break;
		default:break;
		}
		return pizza;
	}
}

abstract class Pizza{
	
	public abstract void prepare(); 
	public abstract void bake();
	public abstract void cut();
	public abstract void box();
}

class CheesePizza extends Pizza{

	@Override
	public void prepare() {
		System.out.println("CheesePizza prepare.");
	}

	@Override
	public void bake() {
		System.out.println("CheesePizza bake.");
	}

	@Override
	public void cut() {
		System.out.println("CheesePizza cut.");
	}

	@Override
	public void box() {
		System.out.println("CheesePizza box.");
	}	
}


class ClamPizza extends Pizza{

	@Override
	public void prepare() {
		System.out.println("ClamPizza prepare.");
	}

	@Override
	public void bake() {
		System.out.println("ClamPizza bake.");
	}

	@Override
	public void cut() {
		System.out.println("ClamPizza cut.");
	}

	@Override
	public void box() {
		System.out.println("ClamPizza box.");
	}	
}

}