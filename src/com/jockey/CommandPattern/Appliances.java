package com.jockey.CommandPattern;


public interface Appliances {
	
}


class Light implements Appliances {
	String location;
	
	public Light(String location) {
		super();
		this.location = location;
	}

	public void on() {
		System.out.println(" " + location + " Light is On");
	}
	
	public void off() {
		System.out.println(" " + location + " Light is Off");
	}
	
	public void dim() {
		System.out.println(" " + location + " Light is Dim");
	}
}



class GarageDoor implements Appliances{
	
	String location;
	
	public GarageDoor(String location) {
		super();
		this.location = location;
	}
	public void up() {
		System.out.println(" " + location + " Garage Door is Open");
	}
	public void down() {
		System.out.println(" " + location + " Garage Door is Close");
	}
	public void stop() {
		System.out.println(" " + location + " Garage Door is Stop");
	}
	public void lightOn() {
		System.out.println(" " + location + " Garage Door is lightOn");
	
	}
	public void lightOff() {
		System.out.println(" " + location + " Garage Door is lightOff");
		
	}
}


class CeilingFan implements Appliances{	
	public static final int HIGH = 3;
	public static final int MEDIUM = 2;
	public static final int LOW = 1;
	public static final int OFF = 0;

	String location;
	int speed;
	
	public CeilingFan(String location) {
		super();
		this.location = location;
		speed = OFF;
	}
	
	public void off() {
		speed = OFF;
		System.out.println(" " + location +  " CeilingFan is Off");
	}
	
	public void high() {
		speed = HIGH;
		System.out.println(" " + location +  " CeilingFan is on High");
	}
	public void medium() {
		speed = MEDIUM;
		System.out.println(" " + location +  " CeilingFan is on Medium");
	}
	public void low() {
		speed = LOW; 
		System.out.println(" " + location +  " CeilingFan is on Low");
	}
	public int getSpeed() {
		return speed;
	}
}

class Stereo implements Appliances{
	int volume;
	
	String location;
	
	public Stereo(String location) {
		super();
		this.location = location;
	}

	public void on() {
		System.out.println(" " + location +  " Stereo is On");
	}

	public void off() {
		System.out.println(" " + location +  " Stereo is Off");
	}
	
	public void setCD() {
		
	}
	
	public void setDvd() {
		
	}
	
	public void setRadio() {
		
	}
	
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
}


class TV implements Appliances{
	String location;

	public TV(String location) {
		super();
		this.location = location;
	}
	
	public void on() {
		System.out.println(" " + location + " TV is On");
	}

	public void off() {
		System.out.println(" " + location + " TV is Off");
	}
	
	public void setInputChannel() {
		
	}
	
	public void setVolume() {
		
	}
}

class Hottub implements Appliances{
	int temperature;

	public Hottub( ) {
		super();
	}
	
	public void on() {
		System.out.println(" Hottub is On");
	}

	public void off() {
		System.out.println(" Hottub is Off");
	}
	
	public void circulate() {
		
	}
	
	public void jetsOn() {
		
	}

	public void jetsOff() {
		
	}
	
	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
}

