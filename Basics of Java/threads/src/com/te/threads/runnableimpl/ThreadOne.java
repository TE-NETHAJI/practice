package com.te.threads.runnableimpl;

public class ThreadOne implements Runnable {

	@Override
	public void run() {
		System.out.println("-------threadone started------");
		String[] names = { "a", "b", "c", "d", "e" };
		for (String name : names) {
			System.out.println(name);
		}
		System.out.println("-------threadone ended------");

	}

}
