package com.mageddo.designpatterns.cap_06_1;

public class SimpleRemoteControl {
	
	Command slot;
	
	public SimpleRemoteControl(){}
	
	public void setCommand(Command command){
		slot = command;
	}
	
	public void buttonWasPressed(){
		slot.execute();
	}
	
}
