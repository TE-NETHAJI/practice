package com.te.threads.raceconditions;

public class TableTest2 {
	public static void main(String[] args) {
		Tables2 tables = new Tables2();
		// when two threads tries to hold up the same object then it cause the raceConditions
		// condition
		Runnable ref1 = () -> {
			synchronized (tables) { // using the synchronized block and pass object to be synchronized

				tables.tableInfo(3);

			}

		};

		System.out.println("--------------------");

		Runnable ref2 = () -> {
			synchronized (tables) {
				tables.tableInfo(8);

			}
		};

		Thread thread1 = new Thread(ref1);
		Thread thread2 = new Thread(ref2);

		thread1.start();
		thread2.start();

	}

}
