package com.te.springcore;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.springcore.beans.Employee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Hello world!
 *
 */

public class App {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		
		Employee emp1 = context.getBean("emp", Employee.class);

		System.out.println("Enter the Name for EMP one");
		emp1.setName(sc.next());

		System.out.println("Enter the Id for EMP one");
		emp1.setId(Integer.parseInt(sc.next()));

		System.out.println("Enter thr role for EMP one");
		emp1.setRole(sc.next());

		System.out.println(emp1);
		System.out.println("=======================================");
		Employee emp2 = context.getBean("emp", Employee.class);

		System.out.println("Enter the Name for EMP two");
		emp2.setName(sc.next());

		System.out.println("Enter the Id for EMP two");
		emp2.setId(Integer.parseInt(sc.next()));

		System.out.println("Enter thr role for EMP two");
		emp2.setRole(sc.next());

		System.out.println(emp2);
		System.out.println(emp1);

	}
}
