package songs;

import instruments.Drums;
import instruments.Guitar;
import instruments.Lyrics;
import instruments.Piano;

public class Song implements IVisitor {
	
	protected String songName;
	protected String artist;
	
	
	@Override
	public String getSongName() {
		//Should never be used directly from song
		return null;
	}
	@Override
	public String getArtist() {
		//Should never be used directly from song		
		return null;
	}
	@Override
	public void getDrums(Drums drums) {
		//Should never be used directly from song		
	}
	@Override
	public void getGuitar(Guitar guitar) {
		//Should never be used directly from song		
	}
	@Override
	public void getPiano(Piano piano) {
		//Should never be used directly from song		
	}
	@Override
	public void getLyrics(Lyrics lyrics) {
		//Should never be used directly from song
		
	}
	
}
