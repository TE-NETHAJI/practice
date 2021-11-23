package employees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import employees.Employees.EmployeeTest;

public class Main {
	public static void main(String[] args) {
		Employees employee1=new Employees("Aam", "kumar",1000);
		Employees employee2=new Employees("Baren","dev",1000);
		EmployeeTest emptest=new EmployeeTest();
		
		emptest.setRaise(employee1);
		emptest.setRaise(employee2);
		
		List<Employees> em = new ArrayList<Employees>();
		em.add(employee1);
		em.add(employee2);
		Comparator<Employees> emp = new Comparator<Employees>() {
			
			@Override
			public int compare(Employees o1, Employees o2) {
			
				return o1.getFirstName().compareTo(o2.getFirstName());
			}
			
		};
		Collections.sort(em, emp);
		System.out.println(em);
	}

}
