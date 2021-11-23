package trining;

import java.util.Comparator;

public class Employetest   {
	public static void main(String[] args) {
		Employee empl1 = new Employee();
		empl1.setEid(2005);
		empl1.setEnme("nethaji");
		empl1.setRole("project lead");
		empl1.setSalary(250000);
		
		
		Employee emp2 =new Employee();
		emp2.setEid(5000);
		emp2.setEnme("subas");
		emp2.setRole("inter");
		
		Employee emp3 = new Employee();
		emp3.setEid(5000);
		emp3.setEnme("subas"); 
        emp3.setRole("inter");
		
		Object[] employees1 = new Object[5];
		employees1[0] = empl1;
		employees1[1] = emp2;
		employees1[2] = emp3;
		
		
		
		try {
			for(Object emp :employees1 ) {
				Employee empD = (Employee) emp;
				System.out.println(empD.getEnme());
			}
		} catch (Exception e) {
			System.out.println("Null pointexp");
		}
		
		
		
		System.out.println(emp2.equals(emp3));
		
		
		

		System.out.println(empl1.hashCode());
		System.out.println(empl1.toString());// no need to call tostring
		System.out.println(empl1.getSalary());
	}



}
