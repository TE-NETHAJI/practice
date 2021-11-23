package com.dev.newmethods;

public class ArrayV3 {

	private int[] arr;
	private int position;
	private final int DEFAULT_SIZE = 5;

	public ArrayV3() {
		arr = new int[DEFAULT_SIZE];
	}

	public ArrayV3(int initSize) {
		arr = new int[initSize];
	}

	public boolean add(int element) {
		arr = ensureCapacity(arr);
		arr[position++] = element;
		return true;

	}

	private int[] ensureCapacity(int[] arr) {
		return position < arr.length ? arr : grow(arr, arr.length);

	}

	private int[] grow(int[] arr, int oldCapacity) {
		int newsize = oldCapacity + (oldCapacity >> 1);
		int[] arr2 = new int[newsize];
		System.arraycopy(arr, 0, arr2, 0, arr.length);
		return arr2;

	}

	public int size() {
		return arr.length;
	}

	public int get(int index) {
		return arr[index];
	}

	public void set(int index, int element) {
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

			data.append(arr[i] + " , ");

		}
		data.append(arr[position - 1] + " ]");
		return data.toString();
	}

}
