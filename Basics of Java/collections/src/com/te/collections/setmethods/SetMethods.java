package com.te.collections.setmethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SetMethods {
	public static void main(String[] args) throws InterruptedException {

		Set<Integer> list = new HashSet<Integer>();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(80);

		Iterator<Integer> itr = list.iterator();
		for (Integer integer : list) {
			System.out.println(integer);

		}
		System.out.println("-------------------------------------------------");

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println(list);
		System.out.println("Check for specified element and returns bolean: " + list.contains(10));
		System.out.println("Class Name: " + list.getClass());
		System.out.println(list.hashCode());
		System.out.println(list.isEmpty());
		System.out.println(list.remove(10));// 10 removed
		System.out.println(list);
		System.out.println(list.size());// display size
		System.out.println(list.toString());// create an array with element od set
		
		List<Integer> li1 = new ArrayList();
		li1.add(20);
		li1.add(80);
		System.out.println(list.containsAll(li1));
		System.out.println(list.removeAll(li1));// remove a those elements in list to see difference
		System.out.println(list);// after removing the li1 from list
		
		System.out.println(list.retainAll(li1)); // retain values of collection in the list
		System.out.println(list);
        
	}
}
