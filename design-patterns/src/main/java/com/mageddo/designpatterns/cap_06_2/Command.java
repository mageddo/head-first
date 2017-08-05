package com.mageddo.designpatterns.cap_06_2;

public interface Command {
	
	// Executa a a��o referente ao Bot�o apertado
	public void execute();
	
	// esta m�todo desfaz a �ltima a��o feita no controle remoto 
	public void undo();
}
