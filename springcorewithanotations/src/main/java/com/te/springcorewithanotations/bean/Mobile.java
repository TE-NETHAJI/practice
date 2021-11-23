package com.te.springcorewithanotations.bean;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Mobile implements Serializable {
	
	@Autowired
	private MoboCompany mobo;
	
}
