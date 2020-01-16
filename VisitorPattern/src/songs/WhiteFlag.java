package songs;

import instruments.Drums;
import instruments.Guitar;
import instruments.Lyrics;
import instruments.Piano;

public class WhiteFlag extends Song implements IVisitor {
	
	//Constructor
	public WhiteFlag() {
		this.artist = "Dido";
		this.songName = "White Flag";
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
		System.out.println("DRUMS: This song have no drums...(It actually does, but yes).");
	}

	@Override
	public void getGuitar(Guitar guitar) {
		System.out.println("GUITAR: Use these accords for the guitar...");
	}

	@Override
	public void getPiano(Piano piano) {
		System.out.println("PIANO: Use these accords for the piano...");
	}

	@Override
	public void getLyrics(Lyrics lyrics) {
		System.out.println("LYRICS: Lyrics in here...");
	}





	
}
