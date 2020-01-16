package songs;

import instruments.Drums;
import instruments.Guitar;
import instruments.Lyrics;
import instruments.Piano;

public class SevenNationArmy extends Song implements IVisitor {

	//Constructor
	public SevenNationArmy() {
		this.artist = "The White Stripes";
		this.songName = "Seven Nation Army";
	}
	
	//Getters & Setters
	@Override
	public String getSongName() {
		return this.songName;
	}

	@Override
	public String getArtist() {
		return this.artist;
	}

	@Override
	public void getDrums(Drums drums) {
		System.out.println("DRUMS: Simple but elegant. Here's how to play it:");
	}

	@Override
	public void getGuitar(Guitar guitar) {
		System.out.println("GUITAR: Everyone knows the riff for this songs, they even chant it in sports events.\n" +
							"Fun fact, there is no bass guitar in this song, just an effect pedal for the guitar.\n"+
							"Also, here's how to play it: ");
	}

	@Override
	public void getPiano(Piano piano) {
		System.out.println("PIANO: No piano for this song.");
	}

	@Override
	public void getLyrics(Lyrics lyrics) {
		System.out.println("LYRICS: Everyone knows about it\n" + 
				"From the Queen of England to the Hounds of Hell...");
	}

}
