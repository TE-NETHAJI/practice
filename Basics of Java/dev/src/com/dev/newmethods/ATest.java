package com.dev.newmethods;

public class ATest {
	public static void main(String[] args) {
		ArrayV3 array = new ArrayV3();

		
		array.add(1);
		array.add(2);
		array.add(3);
		array.add(4);
		array.add(5);
		array.add(6);
		array.add(1);
		array.add(2);
		array.add(3);
		array.add(4);
		array.add(5);
		array.add(6);
		array.remove(5);
		array.set(0, 10);
		System.out.println(array.size());
		System.out.println(array);
		System.out.println(array.get(4));
	}

}
