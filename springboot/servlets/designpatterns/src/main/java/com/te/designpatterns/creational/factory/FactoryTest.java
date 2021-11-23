package com.te.designpatterns.creational.factory;

import java.util.Scanner;

import com.te.designpatterns.creational.Employee;
import com.te.designpatterns.creational.FactoryClass;

public class FactoryTest {
	
	public static void main(String[] args) {
		
		
		try {
			
		Scanner sc = new Scanner(System.in);
		System.out.println("enter type of employee");
		String choice = sc.next();
		Employee emp = FactoryClass.getMethod(choice);
		emp.getDesignation();
		sc.close();
		} catch (NullPointerException e) {
			System.out.println("Wrong Inputs");
			
		}

	
	}

}
