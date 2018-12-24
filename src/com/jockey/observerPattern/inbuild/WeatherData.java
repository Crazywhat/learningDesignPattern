package com.jockey.observerPattern.inbuild;

import java.util.Observable;

//使用java内置的观察者模式
//被观察物 extends Observable
public class WeatherData extends Observable {
	
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {}
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
	
	public void measurementsChanged() {
		setChanged();         //标记已发生改变 不标记则不通知观察者
		notifyObservers();    //继承的通知观察者
	}
	

	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}
	
	
}
