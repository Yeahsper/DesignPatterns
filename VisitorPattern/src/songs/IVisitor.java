package songs;

import instruments.Drums;
import instruments.Guitar;
import instruments.Lyrics;
import instruments.Piano;
/**
 * Interface for the songs, just add your songs and implement this interface and you are good to go.
 * @author Jesper
 *
 */
public interface IVisitor {
	
	public String getSongName();
	public String getArtist();
	
	public void getDrums(Drums drums);
	public void getGuitar(Guitar guitar);
	public void getPiano(Piano piano);
	public void getLyrics(Lyrics lyrics);

}
