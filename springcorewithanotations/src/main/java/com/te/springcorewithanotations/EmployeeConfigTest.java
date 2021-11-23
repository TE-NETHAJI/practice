package com.te.springcorewithanotations;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.te.springcorewithanotations.bean.Employee;
import com.te.springcorewithanotations.config.EmployeeConfig;

public class EmployeeConfigTest {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);

		//Employee emp = context.getBean(Employee.class);
		Scanner sc = new Scanner(System.in);
		
		Employee emp = context.getBean("dc", Employee.class);
		
		System.out.println("Enter EMP one name");
		emp.setName(sc.next());
        System.out.println("enter EMP one ID");
        emp.setId(Integer.parseInt(sc.next()));
        

		Employee emp2 = context.getBean("dc", Employee.class);
		
		System.out.println("Enter EMP two name");
		emp2.setName(sc.next());
        System.out.println("enter EMP two ID");
        emp2.setId(Integer.parseInt(sc.next()));
        
		//emp.setId(100);
		//emp.setName("Nethaji");
		//emp.setRole("Developer");
		//emp.setSalary(25000.0);
		System.out.println(emp);
		
		System.out.println("=============================");
		System.out.println(emp);
		System.out.println(emp2);

	}

}
