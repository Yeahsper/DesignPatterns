package run;

import instruments.Drums;
import instruments.Guitar;
import instruments.Lyrics;
import instruments.Piano;
import songs.IVisitor;
import songs.SevenNationArmy;
import songs.WhiteFlag;

public class RunProgram {

	public static void main(String[] args) {
		//Instruments
		Drums drums = new Drums();
		Guitar guitar = new Guitar();
		Piano piano = new Piano();
		Lyrics lyrics = new Lyrics();
		
		//Songs
		IVisitor wf = new WhiteFlag();
		IVisitor sna = new SevenNationArmy();
		

		
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
	}
	
	

}
