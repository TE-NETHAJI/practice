package com.te.springcorewithanotations.bean;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Department implements Serializable{
  
	private String deptName;
	
	private Integer deptId;
}
