package com.jockey.AdapterPattern;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;

public class IterationEnumerator<E> implements Enumeration<E> {
	Iterator<E> iterator;
	
	public IterationEnumerator(Iterator<E> iterator) {
		super();
		this.iterator = iterator;
	}

	@Override
	public boolean hasMoreElements() {
		return iterator.hasNext();
	}

	@Override
	public E nextElement() {
		return iterator.next();
	}
	
	public static void main(String[] args) {
		
		ArrayList<Integer> integerList = new ArrayList<Integer>();
		integerList.add(0);
		integerList.add(1);
		integerList.add(2);
		integerList.add(3);
		integerList.add(4);
		integerList.add(5);
		
		IterationEnumerator<Integer> adapter = new IterationEnumerator<Integer>(integerList.iterator());
		
		while(adapter.hasMoreElements()) {
			System.out.println(adapter.nextElement());
		}
		
	}

}
