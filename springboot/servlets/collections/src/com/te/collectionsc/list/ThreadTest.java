package com.te.collectionsc.list;

public class ThreadTest {
	public static void main(String[] args) {

		Runnable ref = () -> {
			System.out.println("------ThreadOneStart------------");
			int number[] = { 1, 2, 3 };
			for (int i : number) {
				System.out.println(i);
			}
		};

		Runnable ref2 = () -> {
			System.out.println("-------ThreadTwoStrats----------");
			String s[] = { "A", "B", "C" };
			for (String a : s) {
				System.out.println(a);
			}
		};

		Thread t1 = new Thread(ref);
		t1.start();
		Thread t2 = new Thread(ref2);
		t2.start();
	}
}
