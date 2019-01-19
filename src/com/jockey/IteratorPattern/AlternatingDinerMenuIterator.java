package com.jockey.IteratorPattern;

import java.util.Calendar;
import java.util.Iterator;

public class AlternatingDinerMenuIterator implements Iterator{
	MenuItem[] items;
	int numOfItems;
	int position;
	
	public AlternatingDinerMenuIterator(MenuItem[] items, int numOfItems) {
		super();
		this.items = items;
		this.numOfItems = numOfItems;
		Calendar rightNow = Calendar.getInstance();
		this.position = rightNow.get(Calendar.DAY_OF_WEEK)%2;
	}

	@Override
	public boolean hasNext() {
		
		return position < numOfItems;
	}

	@Override
	public Object next() {
		MenuItem item = items[position];
		position += 2;
		return item;
	}
	
	@Override
	public void remove() {
		throw new UnsupportedOperationException(
				"Alternatin Diner Menu does not support remove()"
				);
	}

}
