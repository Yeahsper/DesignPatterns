package instruments;

import songs.IVisitor;

public class Drums implements IInstrument {
	
	@Override
	public void accept(IVisitor visitor) {
		visitor.getDrums(this);
	}
	
}
