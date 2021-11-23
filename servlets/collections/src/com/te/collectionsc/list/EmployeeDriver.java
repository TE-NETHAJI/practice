package com.te.collectionsc.list;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.TreeSet;
import java.util.Vector;

public class EmployeeDriver {
	public static void main(String[] args) {

		TreeSet<EmployeeNew> set1 = new TreeSet<EmployeeNew>((e1, e2) -> {
			return e1.getName().compareTo(e2.getName());

		});
		set1.add(new EmployeeNew("Nethaji", 12, "FullStackDeveloper", 25000.0));
		set1.add(new EmployeeNew("Muthu", 16, "BackEndDeveloper", 24000.0));
		set1.add(new EmployeeNew("Dev", 18, "ProjectManager", 400000.0));
		set1.add(new EmployeeNew("Ifran", 5, "FrontEndDeveloper", 25000.0));
		for (EmployeeNew employeeNew : set1) {
			System.out.println(employeeNew);
		}
		
		Vector<Integer> em = new Vector<Integer>();
		em.add(null);
		em.add(null);
		System.out.println(em);
		
		Enumeration var = em.elements();
		while (var.hasMoreElements()) {
		System.out.println(var.nextElement());
			
		}
		

	}

}
