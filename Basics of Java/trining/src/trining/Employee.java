package trining;

    // auto generate get and set using source alt+shift+s
	// tap r , tab a, tab r
	// POJO = plain object java object or java beans
	// validate the data before initialize
	// rules of POJO
	// all the data members to private
	// have only default constructor never use parametised cons

public class Employee implements Comparable<Employee>{
	private int eid;
	private String enme;
	private double salary;
	private String role;
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", enme=" + enme + ", salary=" + salary + ", role=" + role + ", hashcode()="
				+ hashCode() + ", getEnme()=" + getEnme() + ", getSalary()=" + getSalary() + ", getRole()=" + getRole()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
  
	
	
	@Override
	public boolean equals(Object obj) {
		
		return this.hashCode() == (obj.hashCode());
	}


	@Override
	public int hashCode() {

		return this.eid;
	}

	
	public String getEnme() {
		return enme;
	}

	public void setEnme(String enme) {
		this.enme = enme;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}



	@Override
	public int compareTo(Employee o) {
		
		return this.eid-o.eid;
	}

}
