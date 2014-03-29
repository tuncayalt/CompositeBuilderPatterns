package composite;
import java.util.Iterator;


public class NullIterator implements Iterator<PartComponent> {

	@Override
	public boolean hasNext() {
		return false;
	}

	@Override
	public PartComponent next() {
		return null;
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

}
