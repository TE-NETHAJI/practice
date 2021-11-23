package com.te.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class StreamAPITest {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();

		list.add(100);
		list.add(11);
		list.add(12);
		list.add(54);
		list.add(56);
		list.add(99);
		list.add(11);
		list.add(12);
		list.add(54);
		list.add(56);

		System.out.println(list);

		List<Integer> mapOutPut = list.stream().map(x -> x * x).collect(Collectors.toList());

		System.out.println(mapOutPut);
		System.out.println("Before  for each");
		System.out.println("------------------------------------");
		 list.stream().map(x -> x).forEach(System.out::println);
		 System.out.println("------------------------------------");
		 System.out.println("After for each");

		// list = mapOutPut;

		System.out.println("----------usingSorted------------------");
		List<Integer> sorted = list.stream().sorted().collect(Collectors.toList());

		System.out.println(sorted);

		System.out.println("--------distinct---------------------");
		List<Integer> distinct = list.stream().distinct().collect(Collectors.toList());
		System.out.println(distinct);

		System.out.println("--------count-----------------------");
		long count = list.stream().count();
		System.out.println(count);

		System.out.println("----------skipped---------------");
		List<Integer> skipped = list.stream().skip(5).collect(Collectors.toList());
		System.out.println(skipped);

		System.out.println("---------filter------------------");
		List<Integer> filterredList = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
		System.out.println(filterredList);

		System.out.println("-------------------");
		list.stream().peek(System.out::println).collect(Collectors.toList());

		/*
		 * System.out.println("---------------------"); System.out.println(
		 * list.stream().collect(Collectors.toList()));
		 */

		// method reference operator( :: )

		System.out.println("-------------------");
		list.stream().filter(a -> a > 50).peek(System.out::println).collect(Collectors.toList());

		list.stream();

	}

}
