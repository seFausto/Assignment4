import java.util.ArrayList;
import java.util.Collection;

public class TwoDimensionalList<E> extends ArrayList<E> {

	private static final long serialVersionUID = 1L;

	private ArrayList<E> array;
	private int numberOfColumns;
	private int maxColumnIndex;

	public TwoDimensionalList(ArrayList<E> arrayList, int columns) {
		array = new ArrayList<E>();
		for (int index = 0; index < arrayList.size(); index++) {
			array.add(arrayList.get(index));
		}

		this.numberOfColumns = columns;
		this.maxColumnIndex = this.numberOfColumns - 1;
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

	public void add(int rowIndex, int columnIndex, E element) {

		if (columnIndex > this.maxColumnIndex) {
			throw new IndexOutOfBoundsException();
		}

		int oneDimensionalIndex = convertToOneDimensionIndex(rowIndex,
				columnIndex);

		this.array.add(oneDimensionalIndex, element);
	}

	private int convertToOneDimensionIndex(int rowIndex, int columnIndex) {
		int oneDimensionalIndex;
		if (rowIndex > 0) {
			oneDimensionalIndex = this.maxColumnIndex
					+ (this.numberOfColumns * (rowIndex - 1)) + columnIndex + 1;
		} else {
			oneDimensionalIndex = columnIndex;
		}
		return oneDimensionalIndex;
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		return this.array.addAll(c);
	}

	@Override
	public void clear() {
		this.array.clear();
	}

	@Override
	public E remove(int index) {
		return array.remove(index);
	}

	public E remove(int rowIndex, int columnIndex) {
		int oneDimensionalIndex = this.convertToOneDimensionIndex(rowIndex,
				columnIndex);
		return array.remove(oneDimensionalIndex);
	}

	@Override
	public boolean remove(Object o) {
		return this.array.remove(o);
	}

	@Override
	public void removeRange(int fromIndex, int toIndex) {
		this.removeRange(fromIndex, toIndex);
	}

	public void removeRange(int fromRowIndex, int fromColumnIndex,
			int toRowIndex, int toColumnIndex) {
		this.removeRange(
				this.convertToOneDimensionIndex(fromRowIndex, fromColumnIndex),
				this.convertToOneDimensionIndex(toRowIndex, toColumnIndex));

	}

	@Override
	public E set(int index, E element) {
		return this.array.set(index, element);
	}

	public E set(int rowIndex, int columnIndex, E element)
	{
		return this.array.set(this.convertToOneDimensionIndex(rowIndex, columnIndex), element);
	}
	
	@Override
	public void trimToSize() {
		this.array.trimToSize();
	}

}
