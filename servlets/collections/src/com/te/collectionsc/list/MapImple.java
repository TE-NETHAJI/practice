package com.te.collectionsc.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapImple {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(10, "Akash");
		map.put(2, "Balaji");
		map.put(30, "Dev");
		map.put(4, "Muthu");
		
		
		 ArrayList<Entry<Integer, String>> jim = new ArrayList<Entry<Integer,String>>(map.entrySet());
		 for (Entry<Integer, String> entry : jim) {
			System.out.println(entry);
		}
		 System.out.println("---------------------------------------------------------");
		 
		 Comparator<Entry<Integer, String>> ref = new Comparator<Entry<Integer,String>>() {
			
			@Override
			public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
				return o2.getKey().compareTo(o1.getKey());
			}
		};
				Collections.sort(jim,ref);
				for (Entry<Integer, String> entry : jim) {
					System.out.println(entry);
				}
				
//		Iterator itr = set.iterator();
//
//		while (itr.hasNext()) {
//			Map.Entry entry = (Map.Entry) itr.next();
//			System.out.println(entry.getKey() + " " + entry.getValue());
//
//		}
//
//		map.putIfAbsent(5, "Nethaji");
//		for (Map.Entry m : map.entrySet()) {
//			System.out.println(m.getKey() + " " + m.getValue());
//
//		}
//
//		HashMap<Integer, String> hm = new HashMap<Integer, String>();
//		hm.putAll(map);
//		System.out.println("After Using putall------");
//		for (Map.Entry m : hm.entrySet()) {
//			System.out.println(m.getKey() + " " + m.getValue());
//
//		}
		// remove with key and remove with value and remove with key and value as pair
//		map.replace(2, "Balaji", "Subas");
//		System.out.println(map);
//		System.out.println("Replace at one short for a specified value");
//		// map.replaceAll((k,v)-> "MAX");
//		System.out.println(map);
//
//		// assending and decending
//		TreeMap<Integer, String> set2 = new TreeMap<Integer, String>(map);
//		Iterator itr2 = set2.keySet().iterator();
//		while (itr.hasNext()) {
//			int key = (int) itr2.next();
//			System.out.println(key + " " + map.get(key));
//
//		}

	}
}
