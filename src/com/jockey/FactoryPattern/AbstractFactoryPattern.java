package com.jockey.FactoryPattern;


/*抽象工厂模式*/


public class AbstractFactoryPattern {

	public static void main(String[] args) {
		
		AbstractFactoryPattern example = new AbstractFactoryPattern();
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
		PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
		switch (pizzaType) {
		case "cheese": pizza = new CheesePizza(ingredientFactory);break;
		case "clam": pizza = new ClamPizza(ingredientFactory);break;
		default:break;
		}
		pizza.setName("Chicago Style " + pizzaType + " Pizza.");
		return pizza;
	}
}

class NYStylePizzaStore extends PizzaStore{

	@Override
	protected Pizza createPizza(String pizzaType) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
		switch (pizzaType) {
		case "cheese": pizza = new CheesePizza(ingredientFactory);break;
		case "clam": pizza = new ClamPizza(ingredientFactory);break;
		default:break;
		}
		pizza.setName("New York Style " + pizzaType + " Pizza.");
		return pizza;
	}
}




abstract class Pizza{
	String name;
	Sauce sauce;
	Dough dough;
	Veggies[] veggies;
	Cheese cheese;
	Pepperoni pepperoni;
	Clams clam;
	
	public abstract void prepare();
	
	
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

class CheesePizza extends Pizza{
	PizzaIngredientFactory ingredientFactory;
	
	public CheesePizza(PizzaIngredientFactory ingredientFactory) {
		super();
		this.ingredientFactory = ingredientFactory;
	}

	@Override
	public void prepare() {
		System.out.println("Prepare " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
	}
	
}


class ClamPizza extends Pizza{
PizzaIngredientFactory ingredientFactory;

public ClamPizza(PizzaIngredientFactory ingredientFactory) {
	super();
	this.ingredientFactory = ingredientFactory;
}

@Override
public void prepare() {
	System.out.println("Prepare " + name);
	dough = ingredientFactory.createDough();
	sauce = ingredientFactory.createSauce();
	cheese = ingredientFactory.createCheese();
	clam = ingredientFactory.createClam();
}

}

}