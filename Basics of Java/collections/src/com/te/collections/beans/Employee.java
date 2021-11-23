package com.te.collections.beans;

public class Employee implements Comparable<Employee> {

	private Integer id;
	
	private String name;
	
	private String role;
	
	@Override
	public int hashCode() {
		
		return id;
	}


	private Double salary;
	
	private String client;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public Employee() {
		super();
		
	}

	public Employee(Integer id, String name, String role, Double salary, String client) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
		this.salary = salary;
		this.client = client;
	}

	@Override
	public String toString() {
		return "\nEmployee [id=" + id + ", name=" + name + ", role=" + role + ", salary=" + salary + ", client=" + client
				+ "]";
	}

	@Override
	public int compareTo(Employee o) {
		
		return this.id - o.id;
		//return o.id -this.id
	}
	
	
}
