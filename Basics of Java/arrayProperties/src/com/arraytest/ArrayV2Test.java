package com.arraytest;

import arrayProperties.Array.ArrayV2;

public class ArrayV2Test {
	public static void main(String[] args) {
		ArrayV2 array = new ArrayV2(4);
		
		System.out.println(array.add(10));
		System.out.println(array.add(20));
		System.out.println(array.add(10));
		System.out.println(array.add(10));
		System.out.println(array.add(10)); // excwption
		System.out.println(array.add(10));
		System.out.println("=========================");
		System.out.println(array.get(4));
	}

}


