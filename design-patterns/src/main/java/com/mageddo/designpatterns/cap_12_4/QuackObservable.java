package com.mageddo.designpatterns.cap_12_4;

public interface QuackObservable {
	public void registerObserver(Observer observer);
	public void notifyObservers();
}
