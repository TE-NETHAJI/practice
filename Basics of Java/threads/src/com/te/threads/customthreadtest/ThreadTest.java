package com.te.threads.customthreadtest;

import com.te.threads.customthread.ThreadOne;
import com.te.threads.customthread.ThreadTwo;

public class ThreadTest {

	public static void main(String[] args) {

		System.out.println("--------mainstarted---------");

		ThreadOne one = new ThreadOne();
		System.out.println("----------------------------");
		ThreadTwo two = new ThreadTwo();

		/*
		 * one.run(); two.run();
		 */
		// runMethod will not act like a thread it executes like a normal code
		
		one.start();
		two.start();
		System.out.println("--------mainended-----------");
		
		//thread will creste a new
	}
}
