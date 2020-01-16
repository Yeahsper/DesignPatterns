package instruments;

import songs.IVisitor;

public class Lyrics implements IInstrument {
	
	@Override
	public void accept(IVisitor visitor) {
		visitor.getLyrics(this);
	}

}
