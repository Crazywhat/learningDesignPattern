package com.jockey.observerPattern.inbuild;

import java.util.Observable;
import java.util.Observer;

import com.jockey.observerPattern.self.Subject;

public class CurrentConditionsDisplay implements Observer,DisplayElement {

	private float temperature;
	private float humidity;
	Observable WeatherData;
	
	public  CurrentConditionsDisplay(Observable weatherData) {
		// TODO Auto-generated constructor stub
		this.WeatherData = weatherData;
		this.WeatherData.addObserver(this);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		if(o instanceof WeatherData) {
			this.temperature = ((WeatherData) o).getTemperature();
			this.humidity = ((WeatherData) o).getHumidity();
		}
		this.display();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Current Condition :" + this.temperature + "F degree and  " 
				+ this.humidity + "% humidity.");
	}

}
