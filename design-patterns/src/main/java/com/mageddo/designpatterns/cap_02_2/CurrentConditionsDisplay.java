package com.mageddo.designpatterns.cap_02_2;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

	private double temperature, humidity;
	private Observable observable;
	
	public CurrentConditionsDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}

	@Override
	public void display() {
		System.out.println("Ol� Susie, as condi��es clim�ticas atuais s�o: "+temperature+" �C e humidade relativa de "+humidity+" %");
		
	}

	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof WeatherData){
			WeatherData tempo = (WeatherData) o;
			this.temperature = tempo.getTemperature();
			this.humidity = tempo.getHumidity();
			display();
		}else{
			throw new RuntimeException("O observable passado n�o � uma Weather Data");
		}
		
	}


}
