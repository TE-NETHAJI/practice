package com.te.assignmentproblemscollections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CopyingArrayList {
	public static void main(String[] args) {
		
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		l1.add(60);
		l1.add(70);
		l1.add(80);
		
		List<Integer> l2 = l1;                          // will affect the original data
		List<Integer> l3 = new ArrayList<Integer>(l1);  // not affecting the original data
		l1.set(0, 100);
		l3.set(0, 100);
		
		Iterator<Integer> itr1 = l2.iterator();
		System.out.println("Travers l2");
		while (itr1.hasNext()) {
		 System.out.println(itr1.next());
			
		}
		System.out.println();
		System.out.println("--------------------------------------------------");
		System.out.println("Traverse l3");
		Iterator<Integer> itr2 = l3.iterator();  
		while (itr2.hasNext()) {
		 System.out.println(itr2.next());
			
		}
		System.out.println("------------------Printing L1---------------------");
		System.out.println(l1);
		
		
	}

}
