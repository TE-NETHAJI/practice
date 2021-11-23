package com.arraytest;

import arrayProperties.Array.ArrayV3;

public class ArrayTestV3 {
		public static void main(String[] args) {
			 ArrayV3 array = new ArrayV3(4);
			
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
