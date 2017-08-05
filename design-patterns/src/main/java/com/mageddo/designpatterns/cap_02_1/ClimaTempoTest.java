package com.mageddo.designpatterns.cap_02_1;

public class ClimaTempoTest {
	public static void main(String[] args) {
		
		WeatherData donoDoTempo = new WeatherData();
		
		CurrentConditionsDisplay condicoes = new CurrentConditionsDisplay(donoDoTempo);
		
		donoDoTempo.setMeasurements(18, 60, 10);
		donoDoTempo.setMeasurements(18.5, 62, 10);
	}
}
