package com.jockey.observerPattern.inbuild;

import java.util.Observable;

//ʹ��java���õĹ۲���ģʽ
//���۲��� extends Observable
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
		setChanged();         //����ѷ����ı� �������֪ͨ�۲���
		notifyObservers();    //�̳е�֪ͨ�۲���
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
