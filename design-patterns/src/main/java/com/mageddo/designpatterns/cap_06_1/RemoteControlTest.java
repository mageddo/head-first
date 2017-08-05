package com.mageddo.designpatterns.cap_06_1;

public class RemoteControlTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// criando um controle remoto
		SimpleRemoteControl  controleRemoto = new SimpleRemoteControl();
		
		// criando uma l�mpada
		Light light = new Light();
		
		// criando uma utilidade da l�mpada
		LightOnCommand lightOn = new LightOnCommand(light);
		
		// pareando a lampanda com o controle remoto
		controleRemoto.setCommand(lightOn);
		
		// pressionando o bot�o de a��o da l�mpada
		controleRemoto.buttonWasPressed();

	}

}
