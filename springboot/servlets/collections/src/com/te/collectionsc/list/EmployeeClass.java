package com.te.collectionsc.list;

public class EmployeeClass implements Comparable<EmployeeClass> {
	
	private String name;
	private Integer id;
	private String role;
	private Double salary;
	
	
	public EmployeeClass() {
		
	}
	
	
	public EmployeeClass(String name, Integer id, String role, Double salary) {
		super();
		this.name = name;
		this.id = id;
		this.role = role;
		this.salary = salary;
	}
	
	
	@Override
	public String toString() {
		return "EmployeeClass [name=" + name + ", id=" + id + ", role=" + role + ", salary=" + salary + "]";
	}




	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer getId() {
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


	public Double getSalary() {
		return salary;
	}


	public void setSalary(Double salary) {
		this.salary = salary;
	}


	@Override
	public int compareTo(EmployeeClass o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
