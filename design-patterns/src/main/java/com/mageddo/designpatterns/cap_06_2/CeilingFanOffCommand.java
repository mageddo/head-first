package com.mageddo.designpatterns.cap_06_2;

public class CeilingFanOffCommand implements Command {

	private CeilingFan ceilingFan;
	private int prevSpeed;
	
	public CeilingFanOffCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	
	@Override
	public void execute() {
		ceilingFan.off();
		
	}

	@Override
	public void undo() {
		if(prevSpeed == CeilingFan.HIGH)
			ceilingFan.high();
		else if(prevSpeed == CeilingFan.MEDIUM)
			ceilingFan.medium();
		else if(prevSpeed == CeilingFan.LOW)
			ceilingFan.low();
		else if(prevSpeed == CeilingFan.OFF)
			ceilingFan.off();
		
	}

}
