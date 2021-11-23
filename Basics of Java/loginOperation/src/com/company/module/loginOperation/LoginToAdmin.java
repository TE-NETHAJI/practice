package com.company.module.loginOperation;

import java.util.Scanner;

public class LoginToAdmin {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the UserName: ");
		String user = scanner.next();
		
		System.out.println("Enter the Password: ");
		String password = scanner.next();
		
		LoginTest t = new LoginTest();
		
		try {
			t.loggin(user, password);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	
   
	

}
