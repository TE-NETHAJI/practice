package com.exception.com;

public class Exception {
	public static void main(String[] args) {
		try {
			int a = 10;
			int b = 0;
			int c = a / b;
			System.out.println(c);

			try {
				String s = null;
				System.out.println(s);
			} catch (java.lang.Exception e) {
				System.out.println("string is null");

			}
		} catch (java.lang.Exception e) {
			System.out.println("divide by zero is not possible in java");

		}

	}

}
