package com.jockey.ComponentPattern;

import java.util.Iterator;
import java.util.Stack;

public class CompositerIterator implements Iterator{
	
	Stack stack = new Stack<>();
	
	public CompositerIterator(Iterator iterator) {
		stack.push(iterator);
	}
	
	@Override
	public boolean hasNext() {
		if (stack.empty()) {
			return false;
		}else {
			Iterator iterator = (Iterator)stack.peek();
			if (!iterator.hasNext()) {
				stack.pop();
				return hasNext();
			}else {
				return true;
			}
		}
	}

	@Override
	public Object next() {
		if (hasNext()) {
			Iterator iterator = (Iterator) stack.peek();
			MenuComponent component = (MenuComponent) iterator.next();
			if ( component instanceof Menu) {
				stack.push(component.createIterator());
			}
			return component;
		}else {
			return null;
		}
	}
	
	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}
}
