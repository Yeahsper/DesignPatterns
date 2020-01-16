package run;

import instruments.Drums;
import instruments.Guitar;
import instruments.Lyrics;
import instruments.Piano;
import songs.IVisitor;
import songs.SevenNationArmy;
import songs.Song;
import songs.WhiteFlag;

public class RunProgram {

	public static void main(String[] args) {
		//Instruments
		Drums drums = new Drums();
		Guitar guitar = new Guitar();
		Piano piano = new Piano();
		Lyrics lyrics = new Lyrics();
		
		//Songs
		Song wf = new WhiteFlag();
		IVisitor sna = new SevenNationArmy();
		WhiteFlag wf1 = new WhiteFlag();
		

		
		//WhiteFlag
		System.out.println("How to play " + wf.getSongName() +" by " + wf.getArtist());
		drums.accept(wf);
		guitar.accept(wf);
		piano.accept(wf);
		lyrics.accept(wf);
		
		//Seven Nation Army
		System.out.println("\nHow to play " + sna.getSongName() +" by " + sna.getArtist());
		drums.accept(sna);
		guitar.accept(sna);
		piano.accept(sna);
		lyrics.accept(sna);
		
		//WhiteFlag again
		System.out.println("\nHow to play " + wf1.getSongName() +" by " + wf1.getArtist());
		drums.accept(wf1);
		guitar.accept(wf1);
		piano.accept(wf1);
		lyrics.accept(wf1);
	}
	
	

}
