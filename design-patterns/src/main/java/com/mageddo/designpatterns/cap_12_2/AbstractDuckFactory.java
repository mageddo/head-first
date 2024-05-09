package com.mageddo.designpatterns.cap_12_2;

public abstract class AbstractDuckFactory {
	public abstract Quackable createMallardDuck();
	public abstract Quackable createRedHeadDuck();
	public abstract Quackable createDuckCall();
	public abstract Quackable createRubberDuck();
}
