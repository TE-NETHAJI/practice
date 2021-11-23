package com.te.collectionsc.list;

import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class EmployeeClassTest {
	
	public static void main(String[] args) {
		EmployeeClass empdata = new EmployeeClass("Nethaji", 10, "Developer", 25000.0);
		EmployeeClass empdata1 = new EmployeeClass("Dev", 11, "Developer", 30000.0);
		 
		TreeSet<EmployeeClass> emp = new TreeSet<EmployeeClass>();
		
		emp.add(empdata);
		emp.add(empdata1);
		
		Iterator itr = (Iterator) emp.iterator();
	
		
		
		
	}

}
