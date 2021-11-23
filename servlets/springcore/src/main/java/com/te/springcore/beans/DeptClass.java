package com.te.springcore.beans;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeptClass implements Serializable {

	private Integer deptId;

	private String deptName;

}
