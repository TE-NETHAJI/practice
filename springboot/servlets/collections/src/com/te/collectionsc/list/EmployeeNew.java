package com.te.collectionsc.list;

public class EmployeeNew {

	private String name;
	private Integer id;
	private String role;
	private Double salary;
	
	
	

	
	public EmployeeNew(String name, Integer id, String role, Double salary) {
		super();
		this.name = name;
		this.id = id;
		this.role = role;
		this.salary = salary;
	}


	@Override
	public String toString() {
		return " \n EmployeeDatas [Name= " + name + ", ID = " + id + ", Role= " + role + ", Salary= " + salary + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}


}
