package com.jockey.IteratorPattern;

public class DinerMenuIterator implements Iterator{
	MenuItem[] menuItems;
	int numberOfItems;
	
	int position = 0;
	
	public DinerMenuIterator(MenuItem[] menuItems, int numberOfItems) {
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

}
