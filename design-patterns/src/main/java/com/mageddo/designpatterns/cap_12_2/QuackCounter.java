package com.mageddo.designpatterns.cap_12_2;

public class QuackCounter implements Quackable {

	Quackable quackable;
	private static int quacks = 0;

	public QuackCounter(Quackable quackable) {
		this.quackable = quackable;
	}

	@Override
	public void quack() {
		quackable.quack();
		quacks++;
	}

	public static int getQuacks() {
		return quacks;
	}

}
