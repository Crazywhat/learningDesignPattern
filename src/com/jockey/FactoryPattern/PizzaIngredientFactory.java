package com.jockey.FactoryPattern;



/*
*	为抽象工厂模式服务
*
*/


public interface PizzaIngredientFactory {
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public 	Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClam();
}


class NYPizzaIngredientFactory implements PizzaIngredientFactory{

	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new MarinaraSauce();
	}

	@Override
	public Cheese createCheese() {
		return new ReggianoCheese();
	}

	@Override
	public Clams createClam() {
		return new FreshClams();
	}

	@Override
	public Veggies[] createVeggies() {
		// TODO Auto-generated method stub
		Veggies[] veggies = {new Garlic(),new Onion(),new Mushroom(),new RedPepper()};
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		// TODO Auto-generated method stub
		return new SlicedPepperoni();
	}
	
}


class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{

	@Override
	public Dough createDough() {
		return new ThickCrushDough();
	}

	@Override
	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	@Override
	public Cheese createCheese() {
		return new Mozzarella();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies[] veggies = {new Spinach(),new BlackOlives(),new EggPlant()};
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	@Override
	public Clams createClam() {
		return new FrozenClams();
	}
	
}

//------------------------------------------------------------------------------------

abstract class Dough{
	
}

class ThinCrustDough extends Dough{
	
}

class ThickCrushDough extends Dough{
	
}

//------------------------------------------------------------------------------------
abstract class Sauce{
	
}

class MarinaraSauce extends Sauce{
	
}

class PlumTomatoSauce extends Sauce{
	
}

//------------------------------------------------------------------------------------
abstract class Cheese{
	
}
class ReggianoCheese extends Cheese{
	
}
class Mozzarella extends Cheese{
	
}

//------------------------------------------------------------------------------------
abstract class Veggies{
	
}

class Garlic extends Veggies{
	
}

class Onion extends Veggies{
	
}

class Mushroom extends Veggies{
	
}

class RedPepper extends Veggies{
	
}

class Spinach extends Veggies{
	
}

class BlackOlives extends Veggies{
	
}

class EggPlant extends Veggies{
	
}


//------------------------------------------------------------------------------------
abstract class Pepperoni{
	
}

class SlicedPepperoni extends Pepperoni{
	
}

//------------------------------------------------------------------------------------
abstract class Clams{
	
}

class FreshClams extends Clams{
	
}

class FrozenClams extends Clams{
	
}
//------------------------------------------------------------------------------------