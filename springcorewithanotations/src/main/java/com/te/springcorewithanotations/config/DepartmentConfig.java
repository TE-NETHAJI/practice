package com.te.springcorewithanotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.te.springcorewithanotations.bean.Department;

@Configuration
public class DepartmentConfig {
	@Bean("test")
	public Department getDep() {
		return new Department("Testing", 101);

	}

	@Bean("dev")
	public Department getDepDev() {
		return new Department("Dev", 101);

	}

	@Bean("hr")
	public Department getDepHR() {
		return new Department("HR", 101);

	}

}
