package com.te.threads.bank;

public class InSufficientFunds extends Exception {
	
	public InSufficientFunds(String message) {
		super(message);
	}

}
