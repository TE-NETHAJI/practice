package com.ty.practiceprogram.typecasting;

public class Main {
	public static void main(String[] args) {
      //WideningTypeCasting
		// create int type variable
		int num = 10;
		System.out.println("The integer value: " + num);

		// convert into double type
		double data = num;
		System.out.println("The double value: " + data);
		
		
	//NarrowingTypeCasting
		
		double data1 = 10.0;
		System.out.println("The double value: "+data1);
		
		int num1 = (int)data1;
		System.out.println("The Integer Value: " +num1);
		
		
	}

}
