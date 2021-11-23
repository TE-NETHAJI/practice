package com.te.collections.set;

import java.awt.geom.Area;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

import com.te.collections.listimpl.Student;

public class HashSetStudent {

	public static void main(String[] args) {

		Student student1 = new Student(10, "nethaji");
		Student student2 = new Student(20, "dev");

		Set<Student> students = new HashSet<Student>();

		students.add(student1);
		students.add(student2);
		/*
		 * ArrayList<Student> arrayList = new ArrayList<Student>(students);
		 * Collections.sort(arrayList); for (Student student : arrayList) {
		 * System.out.println(student); }
		 */

		CopyOnWriteArrayList<Integer> arrayList = new CopyOnWriteArrayList<Integer>();
		arrayList.add(10);
		arrayList.add(30);

		Iterator<Integer> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			arrayList.add(40);
			System.out.println(iterator.next());

		}
		System.out.println(arrayList);

	}

}
