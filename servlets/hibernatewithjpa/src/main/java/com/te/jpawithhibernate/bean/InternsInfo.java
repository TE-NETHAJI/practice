

package com.te.jpawithhibernate.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "interns")
@Data
public class InternsInfo implements Serializable {

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;

	public InternsInfo() {
		
		
	}
	@Column
	private String name;

	@Id
	private Integer id;

	@Column(name = "dob")
	private Date dateofbirth;

	@Column
	private String gender;

	@Column(name = "role")
	private String Designation;

	@Column(name = "mobile")
	private Long mobileno;

	@Column
	private Double salary;

	@Column(name = "deptId")
	private Integer deptid;

	@Column(name = "blood_group")
	private String Bloodgroup;

	@Column(name = "Email")
	private String email;
}
