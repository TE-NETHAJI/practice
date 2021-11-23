package com.te.collections.treeset;

import java.util.Iterator;
import java.util.TreeSet;

import com.te.collections.beans.Employee;

public class EmployeeTestTreeSet {
	public static void main(String[] args) {

		Employee employees1 = new Employee(10, "nethaji", "developer", 100000.3, "bosh");
		Employee employees2 = new Employee(20, "dev", "developer", 90000.3, "bosh");
		Employee employees3 = new Employee(30, "lokesh", "developer", 70000.3, "bosh");
		Employee employees4 = new Employee(40, "praveen", "developer", 55000.3, "bosh");
		Employee employees5 = new Employee(50, "muthu", "developer", 90000.3, "bosh");

		TreeSet<Employee> emp = new TreeSet<Employee>();

		emp.add(employees1);
		emp.add(employees2);
		emp.add(employees3);
		emp.add(employees4);
		emp.add(employees5);

		/*
		 * Iterator<Employee> itr = emp.iterator(); while (itr.hasNext()) { Employee
		 * employee = (Employee) itr.next(); System.out.println(itr.next());
		 * 
		 * }
		 */
		for (Employee employee : emp) {
			System.out.println(employee);
			System.out.println();
		}

	}

}
