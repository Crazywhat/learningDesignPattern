package com.jockey.CommandPattern;

public class SimpleRemoteControl {
	Command[] onCommands;
	Command[] offCommands;
	Command undoCommand;
	
	public SimpleRemoteControl() {
		onCommands = new Command[7];
		offCommands = new Command[7];
		for (int i = 0; i != 7; i++) {
			onCommands[i] = new NoCommand();
			offCommands[i] = new NoCommand();
		}
		undoCommand = new NoCommand();
	}
	
	public void setSlot(int slotIndex,Command onCommand,Command offCommand) {
		onCommands[slotIndex] = onCommand;
		offCommands[slotIndex] = offCommand;
	}
	
	public void onButtonWasPressed(int slotIndex) {
		undoCommand = onCommands[slotIndex];
		undoCommand.execute();
		
	}
	
	public void offButtonWasPressed(int slotIndex) {
		undoCommand = offCommands[slotIndex];
		undoCommand.execute();
	}
	
	public void undoButtonWasPressed() {
		undoCommand.undo();
	}
	
	@Override
	public String toString() {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("\n--------- Remote Control ---------\n");
		for (int i = 0; i < offCommands.length; i++) {
			stringBuffer.append("[slot " + i + "] " + onCommands[i].getClass().getName()
					+ "  " + offCommands[i].getClass().getName() + "\n");
		}
		stringBuffer.append("[undo] " + undoCommand.getClass().getName() + "\n");
		return stringBuffer.toString();
	}

}
