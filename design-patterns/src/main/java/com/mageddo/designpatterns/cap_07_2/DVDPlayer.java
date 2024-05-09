package com.mageddo.designpatterns.cap_07_2;

public class DVDPlayer {
	private boolean isDVD = false;
	private String movie;
	void on(){System.out.println("DVD ligado..");}
	void off(){System.out.println("DVD Desligado..");}
	void eject(){System.out.println("Ejetando o DVD");}
	void stop(){System.out.println("Parando DVD Player");}
	void play(String movie){
		if(this.isDVD){
			this.movie = movie; System.out.println("Rodando o filme " + movie);
		}
		else{
			System.out.println("N�o h� DVD na bandeja");
		}
	}
	void setDVD(boolean b){
		this.isDVD = b;
	}
}
