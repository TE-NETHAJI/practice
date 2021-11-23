package com.te.designpatterns.behav.strategy;

public class Addition implements Strategy {

	@Override
	public int doOperation(int a, int b) {
		
		return a+b;
	}

}
