package com.te.collections.beans;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.te.collections.listimpl.Student;

public class StudentList {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		
		list.add(new Student(100, "ethaji"));
		list.add(new Student(20, "Aev"));
		
		for(Student student : list) {
			System.out.println(student);
		}
		System.out.println("after sort");
		Collections.sort(list);
		for(Student student : list) {
			System.out.println(student);
	}

}
}
