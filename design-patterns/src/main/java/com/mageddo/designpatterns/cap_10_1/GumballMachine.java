package com.mageddo.designpatterns.cap_10_1;

public class GumballMachine {
	final static int SOLD_OUT = 0;
	final static int NO_QUARTER = 1;
	final static int HAS_QUARTER = 2;
	final static int SOLD = 3;
	
	int state = SOLD_OUT;
	int count = 0;
	
	public GumballMachine(int count) {
		this.count = count;
		
		if(count > 0){
			state = NO_QUARTER;
		}
	}
	
	public void insertQuarter() {
		if(state == HAS_QUARTER){
			System.out.println("Voc� nao pode colocar outra moeda");
		}else if(state == NO_QUARTER){
			state = HAS_QUARTER;
			System.out.println("Voce colocou uma moeda");
		}else if(state == SOLD_OUT){
			System.out.println("Voce nao pode colocar uma moeda a maquina esta vazia");
		}else if (state == SOLD) {
			System.out.println("Por favor aguarde... nos estamos pegando uma goma para voce");
		}
	}
	
	public void ejectQuarter(){
		if(state == HAS_QUARTER){
			System.out.println("Moeda devolvida");
			state = NO_QUARTER;
		}else if (state == NO_QUARTER) {
			
			System.out.println("Voce tentou tirar uma modeda mas Voce nao colocou uma moeda");
		}else if(state == SOLD){
			System.out.println("Desculpe, voce ja chamou a alavanca");
		}else if (state == SOLD_OUT) {
			System.out.println("Voc� nao pode tirar a moeda, nao existe nenhuma moeda na maquina");
		}
	}
	
	public void turnCranck(){
		if(state == SOLD){
			System.out.println("Pague denovo para pegar outra ");
		}else if (state == NO_QUARTER) {
			System.out.println("Voce jogou mas n�o h� moedas");
		}else if (state == SOLD_OUT) {
			System.out.println("Voce tentou mas n�o infelizmente as gomas acabaram");
		}else if (state == HAS_QUARTER) {
			System.out.println("Voce tentou...");
			
			state = SOLD;
			dispence();
		}
	}

	public void dispence() {
		if(state == SOLD){
			System.out.println("Uma goma indo para a saida");
			
			count--;
			
			if(count == 0){
				System.out.println("Oops.. acabaram as gomas");
				state = SOLD_OUT;
			}else{
				state = NO_QUARTER;
			}
		}
		
	}
	
	@Override
	public String toString() {
		return "\nESTADO: " + state + " | GOMAS: " + count + "\n\n"; 
	}
}
