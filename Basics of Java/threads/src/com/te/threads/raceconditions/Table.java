package com.te.threads.raceconditions;

public class Table {
	
	// make a method synchronized to avoid race conditions
	public synchronized void tableInfo(int a) {
		for (int i = 1; i < 11; i++) {
			System.out.println(i * a);

		}

	}

}
