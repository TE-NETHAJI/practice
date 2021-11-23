package com.te.mockprogram.lamdaexpression;

public class TestClass {
	public static void main(String[] args) {
		System.out.println("---------MainStarts----------------------");
		TestClass c = new TestClass();

		Runnable ref = (() -> {
			synchronized (c) {
				System.out.println("------ThreadOneStarts-----------------");

				for (int i = 1; i < 12; i++) {
					System.out.println(i * 2);
				}
				System.out.println("-------ThreadOneEnds------------------");
			}
		});

		Runnable ref2 = (() -> {
			synchronized (c) {
				System.out.println("------ThreadTwoStarts-----------------");

				String[] s = { "A", "B", "C", "D", "E" };
				for (String string : s) {
					System.out.println(string);
				}
				System.out.println("------ThreadTwoEnds-------------------");
			}
		});

		new Thread(ref).start();
		new Thread(ref2).start();

	}

}
