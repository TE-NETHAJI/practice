package com.te.threads.raceconditions;

public class TableTest {
	public static void main(String[] args) {
		Table tables = new Table();

		Runnable ref1 = () -> {
			tables.tableInfo(3);

		};
		
		System.out.println("--------------------");

		Runnable ref2 = () -> {
			tables.tableInfo(8);
		};

		Thread thread1 = new Thread(ref1);
		Thread thread2 = new Thread(ref2);

		thread1.start();
		thread2.start();

	}

}
