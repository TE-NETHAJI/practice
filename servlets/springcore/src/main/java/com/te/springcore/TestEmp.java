package com.te.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.springcore.beans.Employee;

public class TestEmp {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		
		
		Employee emp = context.getBean("emp", Employee.class);
		emp.setId(100);
		emp.setName("DEV");
		emp.setRole("SeniorDeveloper");
		System.out.println(emp);
		
		System.out.println("==============================================");
		
		Employee emp2 = context.getBean("empProps", Employee.class);
		System.out.println(emp2);
		
		System.out.println("==============================================");
		
		Employee emp3 = context.getBean("empParCon", Employee.class);
		System.out.println(emp3);
				
	}

	
}
