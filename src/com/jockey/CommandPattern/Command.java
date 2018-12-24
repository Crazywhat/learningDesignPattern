package com.jockey.CommandPattern;

public interface Command {
	public void execute();
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