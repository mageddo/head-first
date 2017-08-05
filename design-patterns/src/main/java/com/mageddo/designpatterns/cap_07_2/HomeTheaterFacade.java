package com.mageddo.designpatterns.cap_07_2;

public class HomeTheaterFacade {
	Amplifier amplifier;
	Tuner tuner;
	DVDPlayer dvdPlayer;
	CDPLayer cdpLayer;
	Projector projector;
	TheaterLights lights;
	Screen screen;
	PopcornPopper popcornPopper;
	
	public HomeTheaterFacade(Amplifier amplifier, Tuner tuner,
							DVDPlayer dvdPlayer, CDPLayer cdpLayer,
							Projector projector, TheaterLights lights,
							Screen screen, PopcornPopper popcornPopper
							) {
		this.amplifier = amplifier;
		this.tuner = tuner;
		this.dvdPlayer = dvdPlayer;
		this.cdpLayer = cdpLayer;
		this.projector = projector;
		this.screen = screen;
		this.lights = lights;
		this.popcornPopper = popcornPopper;
	}
	
	void watchMovie(String movie){
		System.out.println("Get a ready to watch a movie..");
		popcornPopper.on();
		popcornPopper.pop();
		
		lights.dim(10);
		
		screen.down();
		
		projector.on();
		projector.wideScreenMode();
		
		
		amplifier.on();
		amplifier.setDVD(dvdPlayer);
		amplifier.setSurroundSound();
		amplifier.setVolume(5);
		
		dvdPlayer.on();
		dvdPlayer.play(movie);
		
	}
	
	void endMovie(){
		System.out.println("Desligando o Home Theater");
		
		popcornPopper.off();
		lights.on();
		screen.up();
		projector.off();
		amplifier.off();
		dvdPlayer.stop();
		dvdPlayer.eject();
		dvdPlayer.off();
		
		
	}
	
}
