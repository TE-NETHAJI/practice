package com.te.employeeregisterations.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="emp_info")
@NoArgsConstructor
public class EmployeeBean implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
	
	@Column(name="blood_group")
	private String bloodGroup;

}


