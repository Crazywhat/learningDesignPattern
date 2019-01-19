package com.jockey.ComponentPattern;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent {
	ArrayList<MenuComponent> menuComponents = new ArrayList<>();
	String name;
	String description;
	
	public Menu(String name, String description) {
		super();
		this.name = name;
		this.description = description;
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
	public void print() {
		System.out.println("\n" + getName());
		System.out.println(", " + getDescription());
		System.out.println("-------------------------");
		
		for (MenuComponent menuComponent : menuComponents) {
			menuComponent.print();
		}
	}

	@Override
	public void add(MenuComponent component) {
		menuComponents.add(component);
	}

	@Override
	public void remove(MenuComponent component) {
		menuComponents.remove(component);
	}

	@Override
	public MenuComponent getChild(int index) {
		return menuComponents.get(index);
	}

	@Override
	public Iterator createIterator() {
		return new CompositerIterator(menuComponents.iterator());
	}

}
