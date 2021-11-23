package com.te.threads.lamdafunctions;

public class MyInterface2Test {
	public static void main(String[] args) {

		MyInterface2 ref = (a) -> {
			System.out.println("First implentation");
			System.out.println(a);
		};
		MyInterface2 ref2 = (c) -> {
			System.out.println("Second implentation");
			System.out.println(c);
		};

		ref.count(10);
		ref2.count(50);

	}

}
