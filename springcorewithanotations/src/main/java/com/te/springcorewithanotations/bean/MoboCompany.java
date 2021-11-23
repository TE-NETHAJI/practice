package com.te.springcorewithanotations.bean;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MoboCompany implements Serializable {

	private String model;

	private String os;

	private Integer ram;

	private Double prize;

}
