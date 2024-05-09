package com.mageddo.designpatterns.cap_06_2;

public class RemoteControlTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// criando um controle remoto
		RemoteControl  controleRemoto = new RemoteControl();
		
		// criando uma l�mpada
		Light light = new Light();
		Stereo stereo = new Stereo();
		CeilingFan ceilingFan = new CeilingFan("TETO");
		
		// criando uma utilidade da l�mpada
		StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
		StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);
		
		LightOnCommand lightOnCommand = new LightOnCommand(light);
		LightOffCommand lightOffCommand = new LightOffCommand(light);
		
		CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
		CeilingFanMediumCommand ceilingFanMediumCommand = new CeilingFanMediumCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);
		
		// alocando botoes
		controleRemoto.setCommand(1, stereoOnWithCDCommand, stereoOffCommand);
		controleRemoto.setCommand(2, lightOnCommand, lightOnCommand);
		controleRemoto.setCommand(3, ceilingFanMediumCommand, ceilingFanOffCommand);
		controleRemoto.setCommand(4, ceilingFanHighCommand, ceilingFanOffCommand);

		controleRemoto.onButtonWasPushed(2); // ligando lampada
		controleRemoto.onButtonWasPushed(1); // ligando som
		controleRemoto.offButtonWasPushed(1); // desligando som
		
		controleRemoto.onButtonWasPushed(3); // velocidade m�dia
		
		System.out.println("\n\n�ltima a��o:");
		controleRemoto.UndoButtonWasPushed(); // voltando �ltima a��o
		System.out.println("\n");
		
		controleRemoto.offButtonWasPushed(3); // velocidade m�dia -> desligar
		controleRemoto.onButtonWasPushed(4); // velocidade alta

	}

}
