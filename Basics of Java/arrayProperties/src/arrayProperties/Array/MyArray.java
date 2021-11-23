package arrayProperties.Array;

public class MyArray {
 	private int[] arr;
	private int position;
	private final int DEFAULT_SIZE = 5;

	public MyArray() {
		arr = new int[DEFAULT_SIZE];
	}

	public MyArray(int InitSize) {
		arr = new int[InitSize];

	}

	public boolean add(int elements) {
		if (position < arr.length) {
			arr[position++] = elements;
		} else {
			// calculating new size
			int newSize = arr.length + (arr.length / 2);
			int[] arr2 = new int[newSize];

			// copying the old array to new Array
			for (int i = 0; i < arr.length; i++) {
				arr2[i] = arr[i];

			}
			arr = arr2; // reassign
			arr[position++] = elements;

		}
		return true;
	}

	public int get(int index) {
		return arr[index];

	}

	public int size() {
		return arr.length;
	}
}
