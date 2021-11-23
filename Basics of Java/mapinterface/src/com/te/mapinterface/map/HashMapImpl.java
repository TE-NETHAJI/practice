package com.te.mapinterface.map;

import java.util.*;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapImpl {
	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		map.put("a", 10);
		map.put("name", 100);
		map.put(null, 1000);
		map.put("a", 10);
		map.put("A", null);
		map.put("Y", null);

		System.out.println(map);

		System.out.println("----------entrySet-------");
		Set<Entry<String, Integer>> enteries = map.entrySet();

		for (Entry<String, Integer> entry : enteries) {
			System.out.println(entry.getKey() + " " + entry.getValue());

		}

		System.out.println("-------------get-----------");

		Set<String> set = map.keySet();
		for (String key : set) {
			System.out.println(key + " " + map.get(key));
		}

		System.out.println("---------iterator--------");

		Iterator<Entry<String, Integer>> itr = enteries.iterator();
 
		
		System.out.println("only values");
		while (itr.hasNext()) {

			System.out.println(itr.next());

		}
		System.out.println("using collections");
		Collection<Integer> integer = map.values();
		
		 
	    Iterator<Integer> itrr = integer.iterator();
	while (itrr.hasNext()) {
		System.out.println(itrr.next());
		
	}
		System.out.println(map.values());

	}

}
