package com.jockey.CommandPattern;

public interface Application {

}


class GarageDoor implements Application{
	public void up() {
		System.out.println("Garage Door is Open");
	}
	public void down() {
		
	}
	public void stop() {
	
	}
	public void lightOn() {
	
	}
	public void lightOff() {
		
	}
}

class Stereo implements Application{
	int volume;
	
	public void on() {
		System.out.println("Stereo is On");
	}

	public void off() {
		System.out.println("Stereo is Off");
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