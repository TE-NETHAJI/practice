package com.te.collectionsc.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class ListImple {
	public synchronized static void main(String[] args) {
	
		

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(20);
		list.add(39);
		list.add(39);
		list.add(56);
		list.add(90);
		list.add(90);
      Set<Integer> set = new  HashSet();
      
		for (Integer integer : list) {
			if (!set.contains(integer)) {
				set.add(integer);
			} else {
				System.out.println("duplicates are" + integer);
			}
		}
		
		  System.out.println("Using ListIterator"); 
		  ListIterator<Integer> itr =list.listIterator(list.size());
		  while (itr.hasPrevious()){ 
			  Integer res=itr.previous();
		  
		       System.out.println(res);
		  } 
		  System.out.println("Using forEach");
		  list.forEach(a->{ System.out.println(a); });
		  
		  System.out.println("using forEachRemaining"); Iterator<Integer> it =
		  list.iterator(); it.forEachRemaining(a->{System.out.println(a);});
		  
		  System.out.println("using collections");
		  Collections.sort(list,Collections.reverseOrder()); System.out.println(list);
		  System.out.println("--------------------------------------");
		  Collections.sort(list); System.out.println(list); LinkedList<Integer> li =
		  new LinkedList<Integer>(); li.addAll(list); System.out.println(li.peek());
		  System.out.println(li.peekFirst()); System.out.println(li.peekLast());
		  
		  System.out.println("-------------traverse--------------"); Iterator<Integer>
		  itr0 = li.descendingIterator(); while (itr0.hasNext()) {
		  System.out.println(itr0.next());
		  
		  } System.out.println("---------------allows null"); li.add(null);
		  System.out.println(li);
		  
		  }
		  
		  private static Set<Integer> HashSet() {
		  
		  return null;
		 
	}
}
