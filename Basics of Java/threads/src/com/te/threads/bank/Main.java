package com.te.threads.bank;

public class Main extends Banking {
	public static void main(String[] args) throws InSufficientFunds {
		
		Banking bank = new Banking();
		
			bank.withDraw(25000);

		    bank.deposite(50);
	}

}
