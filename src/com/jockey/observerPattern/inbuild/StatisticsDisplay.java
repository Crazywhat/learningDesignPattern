package com.jockey.observerPattern.inbuild;

import java.util.Observable;
import java.util.Observer;
import java.util.function.Predicate;

public class StatisticsDisplay implements Observer, DisplayElement {
	private float count = 0;
	private float sumT = 0;
	private float avgT;
	private float maxT;
	private float minT;
	Observable weatherData;
	
	public StatisticsDisplay(Observable weatherData) {
		// TODO Auto-generated constructor stub
		this.weatherData = weatherData;
		weatherData.addObserver(this);
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Avg/Max/Min temperature = " + avgT + "/" + maxT + "/" + minT);
	}

	
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		if(o instanceof WeatherData)
		{
			float currentT = ((WeatherData) o).getTemperature();
			if(count++ == 0)
			{
				sumT = currentT;
				avgT = currentT;
				minT = currentT;
				maxT = currentT;
			}else {
				sumT += currentT;
				avgT = sumT / count;
				if(currentT > maxT) {
					maxT = currentT;
				}
				if(currentT < minT)
				{
					minT = currentT;
				}
			}
			this.display();
		}
	}

}
