package com.te.employeedatabaseproject.driver;

import java.util.Scanner;

import com.te.employeedatabaseproject.fetching.ModeOfOperation;

public class Driver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcom to Employees Database");
		System.out.println("Enter your Crendentials to Login");

		if (Logging.login()) {

			ModeOfOperation.modeOfOperations(sc);
		}

	}
}
