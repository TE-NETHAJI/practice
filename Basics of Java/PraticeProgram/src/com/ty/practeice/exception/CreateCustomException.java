package com.ty.practeice.exception;

public class CreateCustomException {

	public static void calculate(int a, int b) {
		try {
			CustomException e =new CustomException("f");
		System.out.println(a+b);
		System.out.println(a/b);
			
			throw new CustomException("");
		} catch (CustomException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
		calculate(10, 0);
		
	}
}
