package com.mageddo.designpatterns.cap_02_1;

import java.util.ArrayList;

public class WeatherData implements Subject{
	private ArrayList observers;
	private double temperature, humidity, pressure;

	public WeatherData() {
		observers = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
		
	}

	@Override
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		
		if(i >= 0){
			observers.remove(i);
		}
		
	}

	@Override
	public void notifyOberservers() {
		for(int i=0; i<observers.size(); i++){
			Observer observer = (Observer) observers.get(i);
			observer.update(temperature, humidity, pressure);
		}
		
	}
	
	public void measurementsChanged(){
		notifyOberservers();
	}

	public void setMeasurements(double temperature, double humidity, double pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		
		// chamando callback
		measurementsChanged();
	}
	
	/*
	public double getTemperature(){
		return temperature;
	}
	public double getHumidity(){
		return humidity;
	}
	public double getPressure(){
		return pressure;
	}
	
	public abstract void measurementsChanged();
	*/
}
