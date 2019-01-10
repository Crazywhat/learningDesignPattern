package com.jockey.IteratorPattern;

import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator {
	ArrayList<MenuItem> menuItems;
	int position = 0;

	
	public PancakeHouseMenuIterator(ArrayList<MenuItem> menuItems) {
		super();
		this.menuItems = menuItems;
	}


	@Override
	public boolean hasNext() {
		
		return position < menuItems.size();
	}


	@Override
	public Object next() {
		
		return menuItems.get(position++);
	}
	

}
