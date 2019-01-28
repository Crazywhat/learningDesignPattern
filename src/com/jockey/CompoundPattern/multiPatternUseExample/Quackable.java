package com.jockey.CompoundPattern.multiPatternUseExample;

public interface Quackable extends QuackObservable{
	public void quack();
}


class MallardDuck implements Quackable{
	Observable observable;
	
	public MallardDuck(){
		observable = new Observable(this);
	}
	
	@Override
	public void quack() {
		System.out.println("Quack");
		notifyObservers();
	}

	@Override
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	@Override
	public void notifyObservers() {
		observable.notifyObservers();
	}

	@Override
	public String toString() {
		return "Mallard Duck";
	}
	
	
}

class RedheadDuck implements Quackable{
	
	Observable observable;
	
	public RedheadDuck(){
		observable = new Observable(this);
	}
	
	@Override
	public void quack() {
		System.out.println("Quack");
		notifyObservers();
	}
	
	@Override
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	@Override
	public void notifyObservers() {
		observable.notifyObservers();
	}

	@Override
	public String toString() {
		return "Redhead Duck";
	}
	
	
}

class DuckCall implements Quackable{
	
	Observable observable;
	
	public DuckCall(){
		observable = new Observable(this);
	}
	
	@Override
	public void quack() {
		System.out.println("Kwak");
		notifyObservers();
	}
	
	@Override
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	@Override
	public void notifyObservers() {
		observable.notifyObservers();
	}

	@Override
	public String toString() {
		return "Duck Call";
	}
}

class RbbberDuck implements Quackable{
	
	Observable observable;
	
	public RbbberDuck(){
		observable = new Observable(this);
	}
	
	@Override
	public void quack() {
		System.out.println("Squeak");
		notifyObservers();
	}
	
	@Override
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	@Override
	public void notifyObservers() {
		observable.notifyObservers();
	}

	@Override
	public String toString() {
		return "Rbbber Duck";
	}
	
	
}