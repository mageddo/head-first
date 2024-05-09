package com.mageddo.designpatterns.cap_12_4;

public class Quacklogist implements Observer{

	@Override
	public void update(QuackObservable duck) {
		System.out.println("QuackLogist: " + duck + "just quacked");
		
	}
	
}
