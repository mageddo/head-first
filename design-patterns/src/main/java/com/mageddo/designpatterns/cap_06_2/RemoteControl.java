package com.mageddo.designpatterns.cap_06_2;

public class RemoteControl {
	
	private Command[] onCommands;
	private Command[] offCommands;
	private Command undoCommand;
	
	private int l = 7;
	
	public RemoteControl(){
		offCommands = new Command[l];
		onCommands = new Command[l];
		
		Command noComand = new Command() {
			@Override
			public void execute() {
				System.out.println("Sem comando para este bot�o");
			}

			@Override
			public void undo() {
				System.out.println("Sem a��o para refazer");

			}
		};
		
		// setando objeto vazio por padr�o para todos os bot�es at� segunda ordem
		for (int i = 0; i < l; i++) {
			onCommands[i] = noComand;
			offCommands[i] = noComand;
		}
		
		// setando objeto vazio para o bot�o refazer
		undoCommand = noComand;
	}
	
	public void setCommand(int slot, Command onCommand, Command offCommand){
		if(validaBotao(slot)){
			this.onCommands[slot - 1] = onCommand;
			this.offCommands[slot - 1] = offCommand;
		}
		
	}
	
	private boolean validaBotao(int slot){
		if(slot > 0 || slot <= l){
			return true;
		}else{
			System.out.println("O bot�o que voc� tentou pressionar n�o existe!!");
		}
		return false;
	} 

	public void onButtonWasPushed(int slot){
		if(validaBotao(slot)){
			onCommands[slot - 1].execute();
			undoCommand = onCommands[slot - 1];
		}
	}
	
	public void UndoButtonWasPushed(){
		undoCommand.execute();
	}

	public void offButtonWasPushed(int slot){
		if(validaBotao(slot)){
			offCommands[slot - 1].execute();
			undoCommand = onCommands[slot - 1];
		}
	}
	
	@Override
	public String toString() {
		StringBuffer bf = new StringBuffer();
		
		bf.append("\n------ Remote Control -----\n");
		
		for (int i = 0; i < onCommands.length; i++) {
			bf.append("[slot " + i + "] " + onCommands[i].getClass().getName() + "    "+
					offCommands[i].getClass().getName() + "\n");
		}
		
		return bf.toString();
	}
}
