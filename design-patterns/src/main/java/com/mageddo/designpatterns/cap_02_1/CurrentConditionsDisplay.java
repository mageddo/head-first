package com.mageddo.designpatterns.cap_02_1;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

	private double temperature, humidity;
	private Subject weatherData;
	
	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}
	@Override
	public void display() {
		System.out.println("Ol� Susie, as condi��es clim�ticas atuais s�o: "+temperature+" �C e humidade relativa de "+humidity+" %");
		
	}

	@Override
	public void update(double temp, double humidity, double pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		display();
	}

}
