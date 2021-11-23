package com.te.employeenissan.details;


public class Employee implements Comparable<Employee> {
	private int eid;
	private String ename;
	private double salary;
	private String dept;
	private String role;

	
    public Employee() {
    	
    }

	public Employee(int eid, String ename, double salary, String dept, String role) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.dept = dept;
		this.role = role;
	}

	@Override
	public String toString() {
		return"\nEmployee[Eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", dept=" + dept + ", role=" + role
				+ "]";
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid =eid;
	}


	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public int compareTo(Employee o) {
		return this.eid-o.eid;
	}
	

}
