package com.te.collections.listimpl;

import java.io.Serializable;

/**
 * @author subas
 *
 */
public class Student implements Serializable, Comparable<Student> {

	private int id;

	private String name;

	public Student() {

	}

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Student o) {
		// retun this.getId() - std.getId();
		return 0;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

}
