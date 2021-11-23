package com.te.springcorewithanotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import com.te.springcorewithanotations.bean.Employee;

@Configuration
public class EmployeeConfig {

	
	
	@Bean(name="dc")
	@Scope(value="prototype")
	public Employee getMyBean() {
		return new Employee();
		
	}
	//@Primary
	@Bean(name="si")
	public Employee getEmpWithValues() {
		Employee em = new Employee();
		em.setId(300);
		em.setName("Muthu");
		return em;
		
	}
	
	@Bean(name="cons")
	
	public Employee getEmpWithCons() {
		
		return new Employee("Dev", 12, "seniorDeveloper", 30000.0, null);
		
	}
	
	

}
