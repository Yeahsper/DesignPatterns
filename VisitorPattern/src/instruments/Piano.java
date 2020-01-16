package instruments;

import songs.IVisitor;

public class Piano implements IInstrument {

	@Override
	public void accept(IVisitor visitor) {
		visitor.getPiano(this);
	}

}
