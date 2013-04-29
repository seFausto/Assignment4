import java.util.Enumeration;
import java.util.Iterator;


public class EnumerationToInteratorAdapter<E> implements Iterator<E>{

	private Enumeration<E> enumerator;
	
	public EnumerationToInteratorAdapter(Enumeration<E> element) {
		enumerator = element;
	}
	
	@Override
	public boolean hasNext() {
		return this.enumerator.hasMoreElements();
	}

	@Override
	public E next() {
		return this.enumerator.nextElement();
	}

	@Override
	public void remove() {
		this.enumerator.nextElement();
	}

}
