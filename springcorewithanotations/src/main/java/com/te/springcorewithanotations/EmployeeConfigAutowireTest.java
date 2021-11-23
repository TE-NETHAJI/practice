package com.te.springcorewithanotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.springcorewithanotations.bean.Employee;
import com.te.springcorewithanotations.config.AllImports;


public class EmployeeConfigAutowireTest {

	public static void main(String[] args) {
		//ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfigAurowire.class);
		ApplicationContext context = new AnnotationConfigApplicationContext(AllImports.class);
		Employee em = context.getBean(Employee.class);
		System.out.println(em.getName());
		System.out.println(em.getRole());
		if (em.getDept() != null) {
			System.out.println(em.getDept().getDeptName());
			System.out.println(em.getDept().getDeptId());
		} else {
			System.out.println("Depatment Definition is not there");
		}
	}
}
