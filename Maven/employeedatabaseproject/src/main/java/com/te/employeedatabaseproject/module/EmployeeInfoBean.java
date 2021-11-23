package com.te.employeedatabaseproject.module;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "empinfo")

public class EmployeeInfoBean implements Serializable {

	public EmployeeInfoBean() {

	}

	@Column
	private String name;
	
	@Id
	private Integer id;
	
	@Column
	private Date dob;
	
	@Column
	private String role;
	
	@Column
	private String gender;

	@Column
	private Long mobileNo;
	
	@Column
	private Double salary;
	
	@Column
	private String email;

}
