package com.te.springcorewithanotations.bean;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee implements Serializable {
	
	private String name;
	
	private Integer id;
	
	private String role;
	
	private Double salary;
	
	@Autowired(required =false)
	@Qualifier("dev")
	private Department dept;

}
