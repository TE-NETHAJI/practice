package com.te.threads.bank;

public class Banking  {

	int ammount = 100000;

	public synchronized void withDraw(int money) throws InSufficientFunds {
		if (money < ammount) {
			ammount = ammount-money;
			System.out.println("withdraw sucessfull");
			System.out.println("Balance " +ammount);
		} else {
			throw new InSufficientFunds("Insufficient Fund at your account");

		}
	}

	public synchronized void deposite(int money) {
		ammount = ammount + money;
		System.out.println("deposite Sucessfull");
		System.out.println("balance "+ ammount);
	}
}
