package com.te.threads.runnabletest;

import com.te.threads.runnableimpl.ThreadTwo;
import com.te.threads.runnableimpl.ThreadOne;

public class Test {

	public static void main(String[] args) {
		System.out.println("------mainStarted----------");

		ThreadOne one = new ThreadOne();
		ThreadTwo two = new ThreadTwo();

		Thread one1 = new Thread(one);
		Thread two2 = new Thread(two);

		one1.start();
		two2.start();
		System.out.println("----------mainEnded-----------");
	}

}
