package com.te.springcorewithanotations.bean;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Company implements Serializable {
	
	private String name;
	
	private String model;

}
