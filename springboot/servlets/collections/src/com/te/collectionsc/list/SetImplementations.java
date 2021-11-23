package com.te.collectionsc.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetImplementations {
	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<Integer>();
		set.add(10);
		set.add(33);
		set.add(45);
		set.add(44);
		set.add(39);
		set.add(490);
		
		List<Integer> in = new ArrayList<Integer>(set);
		Collections.sort(in);
		for (Integer integer : in) {
			System.out.println(integer);
		}
		
		System.out.println("-----------------------------");
		Collections.sort(in, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2-o1;
			}
		});
		for (Integer integer : in) {
			System.out.println(integer);
		}
		System.out.println("-----------------------------");
		Collections.sort(in, Collections.reverseOrder());
		for (Integer integer : in) {
			System.out.println(integer);
		}
		
		System.out.println("----------------------------");
	    TreeSet<Integer> ts = new TreeSet<Integer>();
	    ts.add(12);
	    ts.add(3);
	    ts.add(90);
	    Iterator<Integer> itr = ts.descendingIterator();
	    while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}
	    System.out.println("small and greater------------------");
	   System.out.println( ts.first());
	  System.out.println(  ts.last());
	  System.out.println(ts.descendingSet());
		
	}

}
