package com.te.java8features;

import java.util.ArrayList;
import java.util.List;

public class ListJava8Methods {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();

		list.add(10);
		list.add(11);
		list.add(12);
		list.add(54);
		list.add(56);

		/*
		 * System.out.println("-----------usingLamdaExpressions----");
		 * 
		 * list.forEach(a -> System.out.println(a * a));
		 * 
		 * System.out.println("---------methods ref(non static)------");
		 * list.forEach(System.out::println);
		 * 
		 * System.out.println("---------methods ref(static)---------");
		 * list.forEach(ListJava8Methods::getData);
		 */
		/*
		 * list.removeIf(x ->{ return x > 50; });
		 */
		
		list.removeIf(ListJava8Methods::filter);
		System.out.println("after remove if" + list);
		
		
		

	}

	public static void getData(int a) {
		System.out.println(a + "im from another method");
	}
	
	public static boolean filter(int a) {
		return a >7;
	}

}
