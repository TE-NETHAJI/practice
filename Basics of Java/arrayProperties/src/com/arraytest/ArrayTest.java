package com.arraytest;

import arrayProperties.Array.MyArray;

public class ArrayTest {
	public static void main(String[] args) {
		MyArray array = new MyArray(4);
		
		System.out.println(array.add(10));
		System.out.println(array.add(20));
		System.out.println(array.add(10));
		System.out.println(array.add(10));
		System.out.println(array.add(10)); // excwption
		System.out.println(array.add(10));
		System.out.println("=========================");
		System.out.println(array.get(4));
		System.out.println(array.size());
	}

}
