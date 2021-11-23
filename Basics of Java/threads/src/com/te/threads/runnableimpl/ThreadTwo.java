package com.te.threads.runnableimpl;

public class ThreadTwo implements Runnable {

	@Override
	public void run() {
		System.out.println("------threadtow starts--------");
		int[] number = { 1, 2, 3, 4, 5, 6 };
		for (int i : number) {
			System.out.println(i);
		}
		System.out.println("------threadtwo ends--------");

	}

}
