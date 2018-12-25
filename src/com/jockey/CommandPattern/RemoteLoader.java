package com.jockey.CommandPattern;

public class RemoteLoader {
public static void main0(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light livingRoomLight = new Light("Living Room");
		Light kitchenLight = new Light("Kitchen");
		CeilingFan cellingFan = new CeilingFan("Living Room");
		GarageDoor garageDoor = new GarageDoor("");
		Stereo stereo = new Stereo("Living Room");
		
		remote.setSlot(0, new LightOnCommand(livingRoomLight), new LightOffCommand(livingRoomLight));
		remote.setSlot(1, new LightOnCommand(kitchenLight), new LightOffCommand(kitchenLight));
		remote.setSlot(2, new CeilingFanHigh(cellingFan), new CeilingFanOff(cellingFan));
		remote.setSlot(3, new GarageDoorOpen(garageDoor), new GarageDoorClose(garageDoor));
		remote.setSlot(4, new StereoOnForCd(stereo), new StereoOff(stereo));
		
		
		System.out.println(remote);
		
		for(int i = 0; i != 5; ++i) {
			remote.onButtonWasPressed(i);
		}

		for(int i = 0; i != 5; ++i) {
			remote.undoButtonWasPressed();
		}
	}

	public static void main1(String[] args) {
		SimpleRemoteControl remoteWithUndo = new SimpleRemoteControl();
		
		CeilingFan cellingFan = new CeilingFan("Living Room");
		
		remoteWithUndo.setSlot(0, new CeilingFanMediumCommand(cellingFan), new CeilingFanOff(cellingFan));
		remoteWithUndo.setSlot(1, new CeilingFanHighCommand(cellingFan), new CeilingFanOff(cellingFan));
		
		remoteWithUndo.onButtonWasPressed(0);
		remoteWithUndo.offButtonWasPressed(0);
		System.out.println(remoteWithUndo);
		remoteWithUndo.undoButtonWasPressed();
		
		
		remoteWithUndo.onButtonWasPressed(1);
		System.out.println(remoteWithUndo);
		remoteWithUndo.undoButtonWasPressed();
		
	}
	
	public static void main(String[] args) {
		Light light = new Light("Living Room");
		TV tv = new TV("Living Room");
		Stereo stereo = new Stereo("Living Room");
		Hottub hottub = new Hottub();
		
		LightOnCommand lightOn = new LightOnCommand(light);
		StereoOnForCd stereoOn = new StereoOnForCd(stereo);
		TVOnCommand tvOn = new TVOnCommand(tv);
		HottubOnCommand hottubOn = new HottubOnCommand(hottub);
		
		LightOffCommand lightOff = new LightOffCommand(light);
		StereoOff stereoOff = new StereoOff(stereo);
		TVOffCommand tvOff = new TVOffCommand(tv);
		HottubOffCommand hottubOff = new HottubOffCommand(hottub);
		
		Command[] partyOn = {lightOn,stereoOn,tvOn,hottubOn};
		Command[] partyOff = {lightOff,stereoOff,tvOff,hottubOff};
		
		MacroCommand partyOnMacro = new MacroCommand(partyOn);
		MacroCommand partyOffMacro = new MacroCommand(partyOff);
		
		SimpleRemoteControl remoteControl = new SimpleRemoteControl();
		
		remoteControl.setSlot(0, partyOnMacro, partyOffMacro);
		
		remoteControl.onButtonWasPressed(0);
		remoteControl.offButtonWasPressed(0);
		
		
	}

}
