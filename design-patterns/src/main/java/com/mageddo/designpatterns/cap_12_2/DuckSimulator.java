package com.mageddo.designpatterns.cap_12_2;

public class DuckSimulator {
	public static void main(String[] args) {
		DuckSimulator simulator = new DuckSimulator();
		
		// criando uma fabrida de patos para "acoplar os Quackables"
		// usando o Padr�o Factory mais precisamente o Abstract Facotory
		AbstractDuckFactory duckFactory =  new DuckFactory(); 
		simulator.simulate(duckFactory);
	}

	private void simulate(AbstractDuckFactory duckFactory) {
		// adiicionando um contador de quacks para os patos com o Padr�o Decorator
		Quackable mallarDuck = duckFactory.createMallardDuck();
		Quackable redHeadDuck = duckFactory.createRedHeadDuck();
		Quackable duckCall = duckFactory.createDuckCall();
		Quackable rubberDuck = duckFactory.createRubberDuck();
		
		System.out.println("\\Duck Simulator\n");
		
		
		simulate(mallarDuck);
		simulate(redHeadDuck);
		simulate(duckCall);
		simulate(rubberDuck);
		
		System.out.println("\nLa vem um pato falso -->");
		
		// fazendo um ganso virar um pato pelo Padr�o Adapter
		Quackable gansoQueVirouPato = new GooseAdapter(new Goose());
		simulate(gansoQueVirouPato);
		
		
		// resultado do Padr�o Adapter
		System.out.printf("Ao todo %d patos fizeram Quack", QuackCounter.getQuacks());
		
	}
	
	private void simulate(Quackable duck) {
		duck.quack();

	}
}
