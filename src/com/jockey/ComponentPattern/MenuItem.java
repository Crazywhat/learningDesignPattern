package com.jockey.ComponentPattern;

import java.util.Iterator;

public class MenuItem extends MenuComponent {
	private String name;
	private String description;
	private boolean vegetarian;
	private double price;
	
	public MenuItem(String name, String description, boolean vegetarian, double price) {
		super();
		this.name = name;
		this.description = description;
		this.vegetarian = vegetarian;
		this.price = price;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public boolean  isVegetarian() {
		return vegetarian;
	}

	@Override
	public void print() {
		System.out.println(" " + getName() + (vegetarian==true ? " ( v ) ":""));
		System.out.print("  -- " + getDescription());
		System.out.println(", " + getPrice());
	}

	@Override
	public Iterator createIterator() {
		return null;
		//return new NullIterator();
	}
}
