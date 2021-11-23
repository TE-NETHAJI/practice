package com.te.assignmentproblemscollections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListToArrayList {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Nethaji");
		list.add("Devarajan");
		list.add("MuthuKumaran");
		list.add("Lokesh");
		list.add("Ifran");

		List<String> list2 = new ArrayList<String>();
		for (int i = 0; i < list.size(); i++) {
			list2 =  (List<String>)list.clone();
		}
		
		
		list2.add("LastName");
		list.add("NotNull");
		System.out.println("------list2-----------------");
		System.out.println(list2);
		System.out.println("--------list-------------------");
		System.out.println(list);
		

	}

}
