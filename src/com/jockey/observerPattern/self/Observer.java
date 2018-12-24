package com.jockey.observerPattern.self;

public interface Observer {
	public void update(float temperture,float humidity,float pressure);
}


class CurrentConditionsDisplay implements Observer,DisplayElement
{
	private float temperature;
	private float humidity;
	Subject WeatherData;
	
	public CurrentConditionsDisplay(Subject weatherData) {
		// TODO Auto-generated constructor stub
		this.WeatherData = weatherData;
		this.WeatherData.registerObserver(this);
	}
	
	@Override
	public void update(float temperture, float humidity, float pressure) {
		// TODO Auto-generated method stub
		this.temperature = temperture;
		this.humidity = humidity;
		this.display();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Current Condition :" + this.temperature + "F degree and  " 
							+ this.humidity + "% humidity.");
	}
	
}


class StatisticsDisplay implements Observer,DisplayElement
{

	@Override
	public void update(float temperture, float humidity, float pressure) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
	
}

class ForecastDisplay implements Observer,DisplayElement
{
	@Override
	public void update(float temperture, float humidity, float pressure) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
	
}

class HeatIndexDisplay implements Observer,DisplayElement
{
	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	public HeatIndexDisplay(Subject weatherData) {
		// TODO Auto-generated constructor stub
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Heat Index is :" + this.computeHeatIndex(this.temperature,this.humidity));
	}

	@Override
	public void update(float temperture, float humidity, float pressure) {
		// TODO Auto-generated method stub
		this.temperature = temperture;
		this.humidity = humidity;
		this.display();
	}
	
	 private float computeHeatIndex(float t, float rh) {
	        float index = (float)((16.923 + (0.185212 * t) + (5.37941 * rh) - (0.100254 * t * rh) +
	            (0.00941695 * (t * t)) + (0.00728898 * (rh * rh)) +
	            (0.000345372 * (t * t * rh)) - (0.000814971 * (t * rh * rh)) +
	            (0.0000102102 * (t * t * rh * rh)) - (0.000038646 * (t * t * t)) + (0.0000291583 *  
	            (rh * rh * rh)) + (0.00000142721 * (t * t * t * rh)) +
	            (0.000000197483 * (t * rh * rh * rh)) - (0.0000000218429 * (t * t * t * rh * rh)) +     
	            0.000000000843296 * (t * t * rh * rh * rh)) -
	            (0.0000000000481975 * (t * t * t * rh * rh * rh)));
	        return index;
	 }
	
}