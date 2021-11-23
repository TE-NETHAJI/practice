package com.te.threads.bank;

public class Bank {

	int ammount = 10000;

	public synchronized void withDraw(int money) {
		System.out.println("Going to withdraw----------");
		if (money > ammount) {
			System.out.println("less Balance Waiting For Deposite");
			try {
				wait();
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
		ammount -= money;
		System.out.println("withdraw sucessfull");

	}

	public synchronized void deposit(int money) {
		System.out.println("Depositing Money-------------");
		ammount += money;
		System.out.println("Deposite Completed");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		notifyAll();

	}

}
