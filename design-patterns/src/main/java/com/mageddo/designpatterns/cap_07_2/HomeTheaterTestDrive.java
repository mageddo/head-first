package com.mageddo.designpatterns.cap_07_2;

public class HomeTheaterTestDrive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// instanciando os equipamentos
		Amplifier amplifier = new Amplifier();
		Tuner tuner = new Tuner();
		DVDPlayer dvdPlayer = new DVDPlayer();
		CDPLayer cdpLayer = new CDPLayer();
		Projector projector = new Projector();
		TheaterLights lights = new TheaterLights();
		Screen screen = new Screen();
		PopcornPopper popcornPopper = new PopcornPopper();

		// criando o home theather
		HomeTheaterFacade home = new HomeTheaterFacade(amplifier, tuner, dvdPlayer, cdpLayer, projector, lights, screen, popcornPopper);

		// assistindo um filme
		home.watchMovie("Jogos mortais 7 ");
		
		System.out.println("\n\n DESATIVANDO: ");
		
		home.endMovie();
		
	}

}
