package com.te.employeedatabaseproject.driver;

import java.util.Scanner;

public class Logging {
	

	public static boolean login() {
		String userName = "root";
		String password = "root";
		String user;
		String pswd;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter userId: ");
		user = scan.next();
		System.out.println("Enter password: ");
		pswd = scan.next();

		if (user.equalsIgnoreCase(userName) && pswd.equalsIgnoreCase(password)) {
			System.out.println("Login successful");
			return true;
		} else {
			System.out.println("Invalid Credentials");
			return false;
		}
		
	}

}
