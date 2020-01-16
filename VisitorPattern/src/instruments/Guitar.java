package instruments;

import songs.IVisitor;

public class Guitar implements IInstrument {
	
	@Override
	public void accept(IVisitor visitor) {
		visitor.getGuitar(this);
	}
	
}
