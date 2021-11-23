package com.te.java8features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import java.util.List;
import java.util.stream.Collectors;

public class AssingmentQuestion {
	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(45);
		numbers.add(55);
		numbers.add(35);
		numbers.add(55);
		numbers.add(54);
		numbers.add(64);
		numbers.add(74);
		numbers.add(80);
		numbers.add(9);
		numbers.add(100);

		List<Integer> evenNumber = numbers.stream().map((a) -> {
			if (a % 2 == 0) {
				return a;
			} else {
				return a + 1;
			}
		}).collect(Collectors.toList());
		System.out.println(evenNumber);
		List<Integer> oddNumber = numbers.stream().map((a) -> a % 2 == 1 ? a : a + 1).collect(Collectors.toList());
		System.out.println(oddNumber);

		List<Float> sqr = numbers.stream().map(a -> (float) Math.sqrt(a)).collect(Collectors.toList());
		System.out.println(sqr);
         
		// we are using the comparator interface and override the compare method
		List<Integer> rev = numbers.stream().sorted(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {

				return o2 - o1;
			}
		}).collect(Collectors.toList());
		System.out.println(rev);
		Collections.sort(numbers);
		Collections.reverse(numbers);
		System.out.println(numbers);

	}

}
