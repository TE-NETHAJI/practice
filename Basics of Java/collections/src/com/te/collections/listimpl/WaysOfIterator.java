package com.te.collections.listimpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class WaysOfIterator {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList();
		
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(70);
		list.add(4, 40);
		list.add(5, 50);
		
		System.out.println("--------using Iterator----------");
		
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.print(" "+itr.next());
		}
		System.out.println();
		
		System.out.println("--------usingListIterator(forward)----------");
		ListIterator<Integer> listIterator = list.listIterator();
		while(listIterator.hasNext()) {
			System.out.print(" "+ listIterator.next());
		}
		System.out.println();
		
		System.out.println("--------usingListIterator(backword)----------");
		ListIterator<Integer> Iterator = list.listIterator(list.size());
		
		while(Iterator.hasPrevious()) {
			System.out.print(" "+ Iterator.previous());
		}
		System.out.println();
		
		
	}

}
