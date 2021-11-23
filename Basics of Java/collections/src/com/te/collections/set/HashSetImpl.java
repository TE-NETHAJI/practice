package com.te.collections.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetImpl {
	public static void main(String[] args) {

		Set<Integer> set = new HashSet<Integer>();

		set.add(10);
		set.add(30);
		set.add(40);
		set.add(70);
		System.out.println(set.isEmpty());

		System.out.println("-------------for each-----------");
		for (Integer integer : set) {
			System.out.println(integer);
		}

		System.out.println("-------------iterator------------");

		Iterator<Integer> iterator = set.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());

		}
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>(set);
		Collections.sort(arrayList);
		System.out.println("After Sort: "+arrayList);

	}

}
