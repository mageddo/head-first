package com.mageddo.designpatterns.cap_06_1;

public class LightOnCommand implements Command{

	Light light;
	
	public LightOnCommand(Light light){
		this.light = light;
	}
	
	@Override
	public void execute() {
		light.on();
		
	}

}
