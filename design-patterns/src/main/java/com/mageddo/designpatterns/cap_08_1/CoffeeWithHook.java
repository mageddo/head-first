package com.mageddo.designpatterns.cap_08_1;

import javax.swing.JOptionPane;

public class CoffeeWithHook extends CaffeineBeverageWithHook{



	public void addSugarAnMilk() {
		System.out.println("Adicionando a��car e leite");
	}

	
	public void brewCoffeeGrinds() {
		System.out.println("Colocando p� de caf� na agua");
	}

	

	@Override
	public void brew() {
		brewCoffeeGrinds();
		
	}

	@Override
	public void addCondiments() {
		addSugarAnMilk();
	}
	
	@Override
	public boolean querCondimentos() {
		String entry = JOptionPane.showInputDialog("Deseja condimentos?\n  true ou false");
		return new Boolean(entry == null ? "false"  : entry.toLowerCase());
	}

}
