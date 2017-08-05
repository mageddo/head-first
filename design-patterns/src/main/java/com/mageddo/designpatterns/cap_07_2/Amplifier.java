package com.mageddo.designpatterns.cap_07_2;

public class Amplifier {
	void on(){System.out.println("Ligando amplificador...");}
	void off(){System.out.println("Desligando amplificador...");}
	void setDVD(DVDPlayer dvd){System.out.println("Colocando o DVD: "); dvd.setDVD(true);}
	void setSurroundSound(){System.out.println("Ativando SurroundSound");};
	void setVolume(int vol){System.out.println("Regulando som para: " + vol);}
	
}
