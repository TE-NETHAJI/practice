package com.te.threads.lamdafunctions;

public class MyInterfaceTest {
	public static void main(String[] args) {

		MyInterface1 ref = () -> {
			System.out.println("im from Interface");
		};

		MyInterface1 ref2 = () -> {
			System.out.println("one more implementation");
		};
		MyInterface1 ref3 = () -> {
			System.out.println("Again one more implementation");
		};

		ref.count();
		ref2.count();
		ref3.count();
	}

}
