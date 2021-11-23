package com.te.collections.treeset.sorts;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

import com.te.collections.beans.Employee;

public class SortingByOptions {
	
	public static void main(String[] args) {

		TreeSet<Employee> employee = null;

		System.out.println("sorting options \n 1.Id \n 2.Name \n 3.Salary \n 4.Client");

		Scanner sc = new Scanner(System.in);

		int opn = sc.nextInt();

		switch (opn) {
		
		case 1:
			employee = new TreeSet<Employee>();
			break;
		case 2:
			employee = new TreeSet<Employee>(new SortByName());
			break;
		case 3:
			employee = new TreeSet<Employee>(new SortBySalary());
			break;
		case 4:
			employee = new TreeSet<Employee>(new SortByClient());
			break;
		default:
			System.out.println("wrong input");
			break;

		}

		Employee employees1 = new Employee(10, "nethaji", "developer", 100000.3, "bosh");
		Employee employees2 = new Employee(20, "dev", "developer", 90000.3, "bosh");
		Employee employees3 = new Employee(30, "lokesh", "developer", 70000.3, "bosh");
		Employee employees4 = new Employee(40, "praveen", "developer", 55000.3, "bosh");
		Employee employees5 = new Employee(50, "muthu", "developer", 90000.3, "bosh");

		employee.add(employees1);
		employee.add(employees2);
		employee.add(employees3);
		employee.add(employees4);
		employee.add(employees5);

		System.out.println(employee);

		/*
		 * TreeSet<Employee> emp = new TreeSet<Employee>(new Comparator<Employee>() {
		 * 
		 * @Override public int compare(Employee o1, Employee o2) {
		 * 
		 * return o2.getId() - o1.getId(); } });
		 */

		/*
		 * emp.add(employees1); emp.add(employees2); emp.add(employees3);
		 */
	}

}
