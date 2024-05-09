package com.mageddo.designpatterns.cap_12_3;

public class DuckSimulator {
	public static void main(String[] args) {
		DuckSimulator simulator = new DuckSimulator();
		AbstractDuckFactory duckFactory =  new DuckFactory(); 
		simulator.simulate(duckFactory);
	}

	private void simulate(AbstractDuckFactory duckFactory) {
		// adiicionando um contador de quacks para os patos com o Padr�o Decorator
		Quackable mallarDuck = duckFactory.createMallardDuck();
		Quackable redHeadDuck = duckFactory.createRedHeadDuck();
		Quackable duckCall = duckFactory.createDuckCall();
		Quackable rubberDuck = duckFactory.createRubberDuck();
		Quackable gansoQueVirouPato = new GooseAdapter(new Goose());
		
		// usando o Padr�o Composite para criar um grupo de patos
		Flock flockOfDucks = new Flock();
		flockOfDucks.add(redHeadDuck);
		flockOfDucks.add(duckCall);
		flockOfDucks.add(rubberDuck);
		flockOfDucks.add(gansoQueVirouPato);
		

		
		Flock flockOfMarllards = new Flock();
		Quackable mallarDuckOne = duckFactory.createMallardDuck();
		Quackable mallarDuckTwo = duckFactory.createMallardDuck();
		Quackable mallarDuckThree = duckFactory.createMallardDuck();
		Quackable mallarDuckFour = duckFactory.createMallardDuck();
		
		flockOfMarllards.add(mallarDuckFour);
		flockOfMarllards.add(mallarDuckThree);
		flockOfMarllards.add(mallarDuckTwo);
		flockOfMarllards.add(mallarDuckOne);
		
		
		// adicionando um n� folha a uma n� ou seja
		// adicinando um grupo de patos dentro de outro grupo
		flockOfDucks.add(flockOfMarllards);
		
		System.out.println("--> Simulador de patos: Simula�ao do grupo inteiro");
		simulate(flockOfDucks);
		
		System.out.println("\n\n\n");
		
		System.out.println("--> Simulador de patos: Simula��o do grupo de Mallards Ducks ");
		simulate(flockOfMarllards);
		
		// resultado do Padr�o Adapter
		System.out.printf("Ao todo %d patos fizeram Quack", QuackCounter.getQuacks());
		
	}
	
	private void simulate(Quackable duck) {
		duck.quack();

	}
}
