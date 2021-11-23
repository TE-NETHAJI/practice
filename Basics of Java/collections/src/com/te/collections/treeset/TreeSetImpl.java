package com.te.collections.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetImpl {
	public static void main(String[] args) {
		
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		
		treeSet.add(5);
		treeSet.add(1);
		treeSet.add(3);
		treeSet.add(0);
		treeSet.add(2);
		treeSet.add(4);
		treeSet.add(6);
		treeSet.add(8);
		treeSet.add(7);
		treeSet.add(11);
		
		Iterator<Integer> itr = treeSet.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next()+" ");
			
		}
		System.out.println();
		
		TreeSet<Character> char1 = new TreeSet<Character>();
	
		char1.add('h');
		char1.add('j');
		char1.add('z');
		
		System.out.println(char1);
		
		TreeSet<String> names = new TreeSet<String>();
		
		names.add("Nethaji");
		names.add("Dev");
		names.add("MuthuKumar");
		
		
		
	}

}
