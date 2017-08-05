package com.mageddo.designpatterns.cap_08_1;

public class Tea extends CaffeineBeverage{
	
	public void addLemon() {
		System.out.println("Adicionando lim�o");
	}

	public void steepTeaBag() {
		System.out.println("Colocando o sach� de ch�");
	}

	@Override
	public void brew() {
		steepTeaBag();
		
	}

	@Override
	public void addCondiments() {
		addLemon();
	}
}
