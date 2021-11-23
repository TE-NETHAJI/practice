package com.te.springcorewithanotations.bean;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.te.springcorewithanotations.interfaces.Animal;

import lombok.Data;

@Data
public class Pet implements Serializable {

	private String name;

	@Autowired(required = false)
	@Qualifier("gor")
	private Animal animal;

}
