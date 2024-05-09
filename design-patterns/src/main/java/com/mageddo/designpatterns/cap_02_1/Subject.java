package com.mageddo.designpatterns.cap_02_1;

public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyOberservers();
}
