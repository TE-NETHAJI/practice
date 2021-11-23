package com.te.employeedatabaseproject.driver;

import java.util.Scanner;

import com.te.employeedatabaseproject.fetching.ModeOfOperation;

public class ReturnMethod {
	
	public static void goBack() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you wanna continue :");
		System.out.println("Y/N");
		String ch = sc.next();
		if(ch.charAt(0) == 'Y' || ch.charAt(0)=='y') {
			ModeOfOperation.modeOfOperations(sc);
			
		}else if(ch.charAt(0) == 'N' || ch.charAt(0)=='n') {
			System.out.println("Thank you, Hava a great day");
			System.exit(0);
		}else {
			System.out.println("Invalid Selection!!!");
		}
	}

}
