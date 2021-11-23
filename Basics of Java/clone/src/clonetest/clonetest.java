package clonetest;

import clone.exception.employees;

public class clonetest {
	public static void main(String[] args) {
		String test = args[0];
		//System.out.println(test);
		employees emp = new employees();
		emp.setEid(10);
		emp.setEnme("nethaji");
		emp.setRole("developer");
		emp.setSalary(32424);

		employees emp1 = null;
		try {
			emp1 = (employees) emp.clone();
			System.out.println((emp.clone().notifyAll()));
			//System.out.println(emp1);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		emp.setEid(10);
		emp.setEnme("ram");
		emp.setRole("intern");
		emp.setSalary(10000);
		//System.out.println(emp);

	}

}
