package employees;

public class Employees{

	private String firstName;
	private String lastName;
	private double salary = 0;

	public Employees() {
		
	}
	
	

	@Override
	public String toString() {
		return "Employees [firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary + "]";
	}



	public Employees(String first, String last, double salary) {
		this.firstName = first;
		this.lastName = last;
		this.salary = salary;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}

     public static class EmployeeTest{
	

	public void display(Employees emp)
	{
		System.out.println("The yearly salary of " + emp.getFirstName() + " " + emp.getLastName() + " is: \t" + emp.getSalary()*12);
	}
	
	
	public void setRaise(Employees emp)
	{
		emp.setSalary(emp.getSalary()*1.1);
	}
	
     
   }
}	


