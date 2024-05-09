package com.mageddo.designpatterns.cap_02_2;

import java.util.ArrayList;
import java.util.Observable;

public class WeatherData extends Observable{
	private double temperature, humidity, pressure;



	public void measurementsChanged(){
		setChanged();
		notifyObservers();
	}

	public void setMeasurements(double temperature, double humidity, double pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		
		// chamando callback
		measurementsChanged();
	}
	
	
	public double getTemperature(){
		return temperature;
	}
	public double getHumidity(){
		return humidity;
	}
	public double getPressure(){
		return pressure;
	}
	
}
