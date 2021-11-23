package com.te.collectionsc.list;

public class Banking {

	double balance = 10000000000000.0;

	public synchronized void withdraw(double money) throws InsufficientBalance {
		if (money < balance) {
			balance -= money;
			System.out.println("Withdrwa Sucessfull");
			System.out.println("current balance " + balance);

		} else {
			throw new InsufficientBalance("Insufficient balance in your account ");

		}
	}

	public synchronized void deposite(double money) {
		balance += money;
		System.out.println("deposited sucessfully " + money);
		System.out.println("current balance " + balance);

	}

}
