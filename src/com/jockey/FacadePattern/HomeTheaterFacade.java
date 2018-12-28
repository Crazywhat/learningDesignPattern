package com.jockey.FacadePattern;

public class HomeTheaterFacade {
	Amplifier amp;
	Tuner tuner;
	DvdPlayer dvd;
	CdPlayer cd;
	Projector projector;
	TheaterLights lights;
	Screen screen;
	PopcornPopper popper;
	
	public HomeTheaterFacade(Amplifier amp, Tuner tuner, DvdPlayer dvd, CdPlayer cd, Projector projector,
			TheaterLights lights, Screen screen, PopcornPopper popper) {
		super();
		this.amp = amp;
		this.tuner = tuner;
		this.dvd = dvd;
		this.cd = cd;
		this.projector = projector;
		this.lights = lights;
		this.screen = screen;
		this.popper = popper;
	}

	public void watchMOvie(String movie) {
		System.out.println("Get ready to watch a movie...");
		popper.on();
		popper.pop();
		lights.dim(10);
		screen.down();
		projector.on();
		projector.wideScreenMode();
		amp.on();
		amp.setDvd(dvd);
		amp.setSurroundSound();
		amp.setVolume(5);
		dvd.on();
		dvd.play(movie);
	}
	
	public void endMovie() {
		System.out.println("Shutting movie theater down...");
		popper.off();
		lights.on();
		screen.up();
		projector.off();
		amp.off();
		dvd.stop();
		dvd.eject();
		dvd.off();
	}


	public static void main(String[] args) {
		Amplifier amp = new Amplifier();
		Tuner tuner = new Tuner();
		DvdPlayer dvd = new DvdPlayer();
		CdPlayer cd = new CdPlayer();
		Projector projector = new Projector();
		TheaterLights lights = new TheaterLights();
		Screen screen = new Screen();
		PopcornPopper popper = new PopcornPopper();
		
		HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, dvd, cd, projector, lights, screen, popper);
		
		homeTheater.watchMOvie("Dumb And Dumber");
		homeTheater.endMovie();
	}

}

class Amplifier {
	DvdPlayer dvd;
	int volume;
	public void on() {
		System.out.println("Top-O-Line Amplifier on");	
	}
	public void off() {
		System.out.println("Top-O-Line Amplifier off");	
	}
	public void setDvd(DvdPlayer dvd) {
		this.dvd = dvd;
	}
	public void setSurroundSound() {
		System.out.println("Top-O-Line Amplifier surround sound on (5 speakers, 1 subwoofer)");	
	}
	public void setVolume(int volume) {
		this.volume = volume;
		System.out.println("Top-O-Line Amplifier setting volume to " + volume ); 
	}
}

class Tuner{
	
}

class DvdPlayer{
	String movie;
	public void on() {
		System.out.println("Top-O-Line DVD Player on");	
	}
	public void off() {
		System.out.println("Top-O-Line DVD Player off");	
	}
	public void play(String movie) {
		this.movie = movie;
		System.out.println("Top-O-Line DVD Player playing \"" + movie + "\"");	
	}
	public void stop() {
		System.out.println("Top-O-Line DVD Player stopped \"" + movie + "\"");	
	}
	public void eject() {
		System.out.println("Top-O-Line DVD Player eject");	
	}
}

class CdPlayer{
	
} 

class Projector{
	public void on() {
		System.out.println("Top-O-Line Projector on");	
	}
	public void wideScreenMode() {
		System.out.println("Top-O-Line Projector in widescreen mode (16x9 aspect ratio)");	
	}
	public void off() {
		System.out.println("Top-O-Line Projector off");	
	}
}

class TheaterLights{
	int brightness;
	public void dim(int brightness) {
		this.brightness = brightness;
		System.out.println("Theater Ceiling Lights dimming to " + brightness + "%");
	}
	public void on() {
		System.out.println("Theater Ceiling Lights on");
	}
}

class Screen{
	public void down() {
		System.out.println("Theater Screen going down");
	}
	public void up() {
		System.out.println("Theater Screen going up");
	}
}

class PopcornPopper{
	public void on() {
		System.out.println("Popcorn Popper on");
	}
	public void off() {
		System.out.println("Popcorn Popper off");
	}
	public void pop() {
		System.out.println("Popcorn Popper popping popcorn!");
	}
}