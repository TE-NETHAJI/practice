package com.te.springcorewithanotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.te.springcorewithanotations.bean.Employee;

@Configuration
public class EmployeeConfigAurowire {
	
	@Bean
	public Employee getEmp() {
		
		Employee emp = new Employee();
		emp.setName("selma");
		emp.setId(10);
		return emp;
		
	}

}
