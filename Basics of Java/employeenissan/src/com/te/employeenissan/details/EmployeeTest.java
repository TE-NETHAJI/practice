package com.te.employeenissan.details;


import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setEid(101);
		emp.setEname("Nethaji");
		emp.setRole("Developer");
		emp.setDept("Production");
		emp.setSalary(25000);
		
		Employee emp2 = new Employee();
		emp2.setEid(10);
		emp2.setEname("Subas");
		emp2.setRole("Developer");
		emp2.setDept("Production");
		emp2.setSalary(25000);
		
		TreeSet<Employee> list = new TreeSet<Employee>();
		
		
		list.add(emp);
		list.add(emp2);
	
	
		TreeSet<Employee> list1 = new TreeSet<Employee>(( e1, e2)->{
			return e1.getEname().compareTo(e2.getEname());
		});
		
		
		list1.add(emp);
		list1.add(emp2);
		
		System.out.println("using comparator----------------------------------");
		
		TreeSet<Employee> list2 = new TreeSet<Employee>(new Comparator<Employee>() {

			@Override
			public int compare(Employee e1, Employee e2) {
			
				return e2.getEname().compareTo(e1.getEname());
			}
		});
		Iterator<Employee> it = list2.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
		
		
		list2.add(emp);
		list2.add(emp2);
		
		
		
		System.out.println(list);
		
		System.out.println("----------------------");
		
		System.out.println(list1);
		
		System.out.println("------------");
		System.out.println(list2);
		
		
		
		
		
		
	}

}
