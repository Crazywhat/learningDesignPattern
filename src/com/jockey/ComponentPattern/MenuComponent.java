package com.jockey.ComponentPattern;

import java.util.Iterator;

public abstract class MenuComponent{
	public String getName() {
		throw new UnsupportedOperationException();
	}
	public String getDescription() {
		throw new UnsupportedOperationException();
	}
	public double getPrice() {
		throw new UnsupportedOperationException();
	}
	public boolean isVegetarian() {
		throw new UnsupportedOperationException();
	}
	public void print() {
		throw new UnsupportedOperationException();
	}
	public void add(MenuComponent component) {
		throw new UnsupportedOperationException();
	}
	public void remove(MenuComponent component) {
		throw new UnsupportedOperationException();
	}
	
	public MenuComponent getChild(int index) {
		throw new UnsupportedOperationException();
	}
	
	public abstract Iterator createIterator();
}
