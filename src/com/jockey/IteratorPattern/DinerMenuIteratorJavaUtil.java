package com.jockey.IteratorPattern;

import java.util.Iterator;

public class DinerMenuIteratorJavaUtil implements java.util.Iterator{
	MenuItem[] menuItems;
	int numberOfItems;
	
	int position = 0;
	
	public DinerMenuIteratorJavaUtil(MenuItem[] menuItems, int numberOfItems) {
		super();
		this.menuItems = menuItems;
		this.numberOfItems = numberOfItems;
	}

	@Override
	public boolean hasNext() {
		return position < numberOfItems;
	}

	@Override
	public MenuItem next() {
		return menuItems[position++];
	}

	@Override
	public void remove() {
		if (position <= 0) {
			throw new IllegalStateException("You cann't remove an item until you've done at least one next()");
		}
		
		for(int i = position-1; i != numberOfItems-1; ++i) {
			menuItems[i] = menuItems[i];
		}
		menuItems[numberOfItems - 1] = null;
		--numberOfItems;
		--position;
	}
	
	

}
