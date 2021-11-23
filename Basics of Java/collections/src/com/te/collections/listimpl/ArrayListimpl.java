package com.te.collections.listimpl;

import java.util.*;

public class ArrayListimpl {
	public static void main(String[] args) {
		/*
		 * List list = new ArrayList();
		 * 
		 * list.add(10); list.add("Name"); list.add(null); list.add(10); list.add('h');
		 * list.add(null);
		 * 
		 * for (int i = 0; i < list.size(); i++) { System.out.println(list.get(i));
		 */

		List<Integer> list = new ArrayList<Integer>();

		System.out.println("---------IntialList--------");
		System.out.println(list);
		System.out.println("-----add(data) and add(index,data)-----");
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(70);
		list.add(4, 40);
		list.add(5, 50);
		System.out.println(list);

		System.out.println("-----remove(data) and remove(index)");
		list.remove(0);
		list.remove(new Integer(100));
		System.out.println(list);

		System.out.println("------set(index,data)--");
		list.set(0, 100);
		list.set(3, 3000);
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list);

		System.out.println("-------------clear()-----");
		list.clear();
		System.out.println(list);

		System.out.println("----contains(data)---and containsall()---");
		System.out.println(list.contains(20));
		System.out.println(list.contains(100));

		List<Integer> integers = new ArrayList<Integer>();
		integers.add(10);
		integers.add(20);
		System.out.println(list.containsAll(integers));

		System.out.println("-------indexof(data)--and lastindex()---");
		list.add(20);
		System.out.println(list);
		System.out.println(list.indexOf(20));
		System.out.println(list.lastIndexOf(20));

		System.out.println("-----isEmpty()-----" + list.isEmpty());
		//System.out.println(list.removeAll(integers));
		System.out.println("after remove all list " + list);

		System.out.println("------toArray-------");
		Object[] arr = list.toArray();
		System.out.println(arr);

		System.out.println("---------sublist(sindext,liindes)----");

		System.out.println(list);
		List<Integer> subList = list.subList(0, 0);
		System.out.println(subList);

		System.out.println("--------get(index)--------");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));

		}

		System.out.println("-------sortingArrayLIST---------");
		System.out.println("before sort" + list);
		Collections.sort(list);
		System.out.println("after sort" + list);

	}
}
