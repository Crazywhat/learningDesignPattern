package com.jockey.CompoundPattern.multiPatternUseExample;

import java.util.ArrayList;
import java.util.Iterator;

//CompositePattern

public class Flock implements Quackable {
	ArrayList<Quackable> quackers = new ArrayList<>();
	
	
	public void add(Quackable quacker) {
		quackers.add(quacker);
	}
	
	@Override
	public void quack() {
		
		//IteratorPattern
		
		Iterator<Quackable> iterator = quackers.iterator();
		while (iterator.hasNext()) {
			Quackable quacker = iterator.next();
			quacker.quack();
		}
	}

	@Override
	public void registerObserver(Observer observer) {
		for (Quackable quackable : quackers) {
			quackable.registerObserver(observer);
		}
	}

	
	//每个Observable会自己通知观察者
	@Override
	public void notifyObservers() {}

}
