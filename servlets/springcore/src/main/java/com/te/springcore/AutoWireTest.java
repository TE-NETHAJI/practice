package com.te.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.springcore.beans.Employee;

public class AutoWireTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("allConfig.xml");
		
		Employee emp = context.getBean("emp", Employee.class);
		
		System.out.println("EMP details");
		System.out.println(emp.getName());
		System.out.println(emp.getRole());
		System.out.println("Department details");
		System.out.println(emp.getDept().getDeptName());
		System.out.println(emp.getDept().getDeptId());
	}

}
