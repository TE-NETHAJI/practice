package com.te.collectionsc.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ArrayImple {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();

		list.add("Nethaji");
		list.add("Muthu");
		list.add("Nethaji");

		ArrayList<String> list2 = new ArrayList<String>();
		ArrayList<String> list3 = (ArrayList<String>) list.stream().distinct().collect(Collectors.toList());
		
		

		if (list2.contains(list)) {
			System.out.println(list2.addAll(list));
		} else {
			System.out.println("duplicates " + list);
		}
		
		System.out.println(list3);
	}

}
