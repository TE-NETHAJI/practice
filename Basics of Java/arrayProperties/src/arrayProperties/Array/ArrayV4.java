package arrayProperties.Array;

public class ArrayV4 {
	private Object[] arr;
	private int position;
	private final int DEFAULT_SIZE = 5;

	public ArrayV4() {
		arr = new Object[DEFAULT_SIZE];
	}

	public ArrayV4(int InitSize) {
		arr = new Object[InitSize];

	}

	public boolean add(Object element) {
		arr = enSureCapacity(arr);
		arr[position++] = element;
		return true;
	}

	private Object[] enSureCapacity(Object[] arr2) {
		return (position < arr2.length) ? arr2 : grow(arr2, arr2.length);

	}

	private Object[] grow(Object[] arr22, int oldCapacity) {
		int newSize = oldCapacity + (oldCapacity >> 1);
		Object[] arr2 = new Object[newSize];
		System.arraycopy(arr22, 0, arr2, 0, arr22.length);
		return arr2;

	}

	public Object get(int index) {
		return arr[index];
	}

	public int size() {
		return arr.length;
	}

	public void set(int index, Object element) {
		arr[index] = element;

	}

	public void remove(int index) {
		int length = arr.length - index - 1;
		System.arraycopy(arr, index + 1, arr, index, length);
		position--;
  	}

	@Override
	public String toString() {
		StringBuilder data = new StringBuilder(" [ ");
		for (int i = 0; i < position - 1; i++) {
			data.append(arr[i] + " ,");
		}
		data.append(arr[position - 1] + " ]");
		return data.toString();
	}

}
