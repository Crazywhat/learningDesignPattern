package com.jockey.CommandPattern;

public interface Command {
	public void execute();
}


class NoCommand implements Command{

	@Override
	public void execute() {
		
	}
	
}

class LightOnCommand implements Command{
	Light light;
	
	public LightOnCommand(Light light) {
		super();
		this.light = light;
	}

	@Override
	public void execute() {
		light.on();
	}
	
}

class LightOffCommand implements Command{
	Light light;
	
	public LightOffCommand(Light light) {
		super();
		this.light = light;
	}

	@Override
	public void execute() {
		light.off();
	}
}


class GarageDoorOpen implements Command{
	GarageDoor garageDoor;
	
	public GarageDoorOpen(GarageDoor garageDoor) {
		super();
		this.garageDoor = garageDoor;
	}

	@Override
	public void execute() {
		garageDoor.up();
	}
	
}


class GarageDoorClose implements Command{
	GarageDoor garageDoor;
	
	public GarageDoorClose(GarageDoor garageDoor) {
		super();
		this.garageDoor = garageDoor;
	}

	@Override
	public void execute() {
		garageDoor.down();
	}
	
}

class CellingFanHigh implements Command{
	Fan fan;
		
	public CellingFanHigh(Fan fan) {
		super();
		this.fan = fan;
	}

	@Override
	public void execute() {
		fan.on();
	}
}


class CellingFanOff implements Command{
	Fan fan;
		
	public CellingFanOff(Fan fan) {
		super();
		this.fan = fan;
	}

	@Override
	public void execute() {
		fan.off();
	}
}

class StereoOnForCd implements Command{
	Stereo stereo;
	
	public StereoOnForCd(Stereo stereo) {
		super();
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		stereo.on();
		stereo.setCD();
		stereo.setVolume(11);
	}
	
}



class StereoOff implements Command{
	Stereo stereo;
	
	public StereoOff(Stereo stereo) {
		super();
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		stereo.off();
	}
	
}

