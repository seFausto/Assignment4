import java.util.ArrayList;
import java.util.Collection;

public class ImmutableArrayList<E> extends ArrayList<E> {
	private static final long serialVersionUID = 1L;
	private ArrayList<E> array;

	public ImmutableArrayList(ArrayList<E> arrayList) {
		array = new ArrayList<E>();
		for (int index = 0; index < arrayList.size(); index++) {
			array.add(arrayList.get(index));
		}
	}

	@Override
	public E get(int index) {
		return array.get(index);

	}

	@Override
	public int size() {
		return array.size();

	}

	@Override
	public boolean add(E e) {
		return false;
	}

	@Override
	public void add(int index, E element) {
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		return false;
	}

	@Override
	public void clear() {
	}

	@Override
	public E remove(int index) {
		return array.get(index);
	}

	@Override
	public boolean remove(Object o) {
		return false;
	}

	@Override
	public void removeRange(int fromIndex, int toIndex) {
	}

	@Override
	public E set(int index, E element) {
		return element;
	}

	@Override
	public void trimToSize() {
	}
}
