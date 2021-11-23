package com.arraytest;

import java.util.Iterator;

import arrayProperties.Array.ArrayV4;

public class ArrayV4Test {
	public static void main(String[] args) {
		ArrayV4 array = new ArrayV4(4);

		System.out.println(array.add(1));
		System.out.println(array.add(2));
		System.out.println(array.add(30));
		System.out.println(array.add(40));
		System.out.println(array.add(50)); // exception
		System.out.println(array.add(60));
		array.add(70);
		array.add(80);
		array.add(30);
		System.out.println("=========================");
		System.out.println(array.get(1));
		System.out.println(array.get(0));
		array.remove(4);
		System.out.println(array);
		System.out.println(array.get(array.size()-1));
		System.out.println(array.get(5));
		System.out.println(array.size());
		System.out.println(array.get(6));
		System.out.println(array.get(7));
		System.out.println(array);
		System.out.println(array.size());
		for (int i = 0; i < args.length; i++) {
			String string = args[i];
			
		}

	}
}
