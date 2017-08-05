package com.mageddo.designpatterns.cap_11_3;

import java.rmi.Naming;
import java.util.Scanner;

public class GumballMachineTestDrive {
	public static void main(String[] args) {
		GumballMachine gumballMachine; 
		String localizacao = "Morumbi";
		int qtd = 5;
		
		try{
			gumballMachine = new GumballMachine(localizacao, qtd);
			Naming.rebind("gumballMachine", gumballMachine);
		
			// cmd do cliente
			Scanner leitor = new Scanner(System.in);
			System.out.println("1 =>> Colocar moeda    2 =>> Tirar Moeda 3 =>> Puxar Alavanca\n");
			while(true){
				System.out.println("Qual o comando?");
				int command = Integer.parseInt(leitor.nextLine());
				gumballMachine.cmd(command);
			}
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
				
		
	}
}	
