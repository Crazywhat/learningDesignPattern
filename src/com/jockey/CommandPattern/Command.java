package com.jockey.CommandPattern;

public interface Command {
	public void execute();
	public void undo();
}


class NoCommand implements Command{

	@Override
	public void execute() {
		
	}

	@Override
	public void undo() {
		
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

	@Override
	public void undo() {
		light.off();
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

	@Override
	public void undo() {
		light.on();
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

	@Override
	public void undo() {
		garageDoor.down();
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

	@Override
	public void undo() {
		garageDoor.up();
	}
	
}

class CeilingFanHigh implements Command{
	CeilingFan fan;
		
	public CeilingFanHigh(CeilingFan fan) {
		super();
		this.fan = fan;
	}

	@Override
	public void execute() {
		fan.high();
	}

	@Override
	public void undo() {
		fan.off();
	}
}


class CeilingFanOff implements Command{
	CeilingFan fan;
	int prevSpeed;
	
	public CeilingFanOff(CeilingFan fan) {
		super();
		this.fan = fan;
	}

	@Override
	public void execute() {
		prevSpeed = fan.getSpeed();
		fan.off();
	}

	@Override
	public void undo() {
		switch (prevSpeed) {
		case CeilingFan.HIGH:fan.high();break;
		case CeilingFan.MEDIUM:fan.medium();break;
		case CeilingFan.LOW:fan.low();;break;
		case CeilingFan.OFF:fan.off();;break;
		default:	break;
		}
	}
}

class CeilingFanHighCommand implements Command{
	CeilingFan fan;
	int prevSpeed;
	
	public CeilingFanHighCommand(CeilingFan fan) {
		super();
		this.fan = fan;
	}

	@Override
	public void execute() {
		prevSpeed = fan.getSpeed();
		fan.high();
	}

	@Override
	public void undo() {
		switch (prevSpeed) {
		case CeilingFan.HIGH:fan.high();break;
		case CeilingFan.MEDIUM:fan.medium();break;
		case CeilingFan.LOW:fan.low();;break;
		case CeilingFan.OFF:fan.off();;break;
		default:	break;
		}
	}
	
}


class CeilingFanMediumCommand implements Command{
	CeilingFan fan;
	int prevSpeed;
	
	public CeilingFanMediumCommand(CeilingFan fan) {
		super();
		this.fan = fan;
	}

	@Override
	public void execute() {
		prevSpeed = fan.getSpeed();
		fan.medium();
	}

	@Override
	public void undo() {
		switch (prevSpeed) {
		case CeilingFan.HIGH:fan.high();break;
		case CeilingFan.MEDIUM:fan.medium();break;
		case CeilingFan.LOW:fan.low();;break;
		case CeilingFan.OFF:fan.off();;break;
		default:	break;
		}	
	}
	
}


class CeilingFanLowCommand implements Command{
	CeilingFan fan;
	int prevSpeed;
	
	public CeilingFanLowCommand(CeilingFan fan) {
		super();
		this.fan = fan;
	}

	@Override
	public void execute() {
		prevSpeed = fan.getSpeed();
		fan.low();
	}

	@Override
	public void undo() {
		switch (prevSpeed) {
		case CeilingFan.HIGH:fan.high();break;
		case CeilingFan.MEDIUM:fan.medium();break;
		case CeilingFan.LOW:fan.low();;break;
		case CeilingFan.OFF:fan.off();;break;
		default:	break;
		}	
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

	@Override
	public void undo() {
		stereo.off();
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

	@Override
	public void undo() {
		stereo.on();	
	}
	
}


class TVOnCommand implements Command{
	TV tv;

	public TVOnCommand(TV tv) {
		super();
		this.tv = tv;
	}

	@Override
	public void execute() {
		tv.on();
	}

	@Override
	public void undo() {
		tv.off();
	}
}


class TVOffCommand implements Command{
	TV tv;

	public TVOffCommand(TV tv) {
		super();
		this.tv = tv;
	}

	@Override
	public void execute() {
		tv.off();
	}

	@Override
	public void undo() {
		tv.on();
	}
}

class HottubOnCommand implements Command{
	Hottub hottub;
	
	public HottubOnCommand(Hottub hottub) {
		super();
		this.hottub = hottub;
	}

	@Override
	public void execute() {
		hottub.on();
	}

	@Override
	public void undo() {
		hottub.off();
	}
}

class HottubOffCommand implements Command{
	Hottub hottub;
	
	public HottubOffCommand(Hottub hottub) {
		super();
		this.hottub = hottub;
	}

	@Override
	public void execute() {
		hottub.off();
	}

	@Override
	public void undo() {
		hottub.on();
	}
}

class MacroCommand implements Command{
	Command[] commands;
	
	public MacroCommand(Command[] commands) {
		super();
		this.commands = commands;
	}

	@Override
	public void execute() {
		for (Command command : commands) {
			command.execute();
		}
	}

	@Override
	public void undo() {
		for (Command command : commands) {
			command.undo();
		}
	}
	
}




