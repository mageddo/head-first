package com.mageddo.designpatterns.cap_06_1;

public class GarageDoorOpenCommand implements Command{
	
	GarageDoor garage;
	
	public GarageDoorOpenCommand(GarageDoor garage) {
		this.garage = garage;
	}
	
	@Override
	public void execute() {
		garage.up();
		
	}

}
