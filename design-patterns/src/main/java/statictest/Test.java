package statictest;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Test {
	public static void main(String[] args) {
				

		
		new Date().getDate();
		
		
		
		
		//Pessoa p = (Pessoa) new Object();
		
		Pessoa p = new Pardo();
		
		System.out.println(p.nome);
		
		p.falar();
		
		
		//print(new ArrayList<String>());
		
		
	}
	
	
	static void somar(){
	
		int[] loop = new int[1000000000];
		long[] loop2 = new long[new Integer("1000")];

		for(int i=0; i<loop.length; i++);
	}
	
	
	public static <E> void print(E e){
		
		
		
		System.out.println(e.toString());
	}
	
	
}


class Pessoa{
	String nome = "Pessoa";
	
	void falar() {
		System.out.println("oi");

	}
	
}


class Pardo extends Pessoa{
	String nome = "Pardo"; 
	
	@Override
	void falar() {
		
			System.out.println(nome);
			System.out.println("sou Pardo");
	}
}