package com.mageddo.designpatterns.cap_06_2;

public class Stereo {
	public void on(){
		System.out.println("Ligar som");
	}
	
	public void off(){
		System.out.println("Desligar som");
	}
	
	public void setCD(){
		System.out.println("Colocar CD");
	}
	
	public void setVolume(int vol){
		System.out.println("Regular volume para: " + vol);
	}
}
