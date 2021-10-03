package com.ty.practiceprogram.typecasting;

public class MultipleCatchBlock1 {
	public static void main(String[] args) {

		try {

			int[] arr = { 1, 2, 3, 4, 5 };
			System.out.println(arr[8]);
			try {
				int a = 10;
				int b = 0;
				System.out.println(a / b);
			} catch (Exception e2) {
				System.out.println("Divide by Zero Is zero");
			}
		} catch (Exception e1) {
			System.out.println("Array out of bound Exception");
		}

	}

}
