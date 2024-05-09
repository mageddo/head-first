package com.mageddo.designpatterns.cap_06_1;

public class RemoteControlTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// criando um controle remoto
		SimpleRemoteControl  controleRemoto = new SimpleRemoteControl();
		
		// criando uma l�mpada e uma garagem
		Light light = new Light();
		GarageDoor door = new GarageDoor();
		
		// criando uma utilidades
		LightOnCommand lightOn = new LightOnCommand(light);
		GarageDoorOpenCommand doorOpenCommand = new GarageDoorOpenCommand(door);
		
		// pareando comandos ao controle remoto e pressionando o botao
		controleRemoto.setCommand(lightOn);
		controleRemoto.buttonWasPressed();
	
		controleRemoto.setCommand(doorOpenCommand);
		controleRemoto.buttonWasPressed();
		

	}

}
