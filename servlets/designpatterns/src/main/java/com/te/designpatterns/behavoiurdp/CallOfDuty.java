package com.te.designpatterns.behavoiurdp;

public class CallOfDuty implements Game {

	@Override
	public void start() {
		System.out.println("welcom");
		
	}

	@Override
	public void init() {
		System.out.println("enemies targeted");
		
	}

	@Override
	public void end() {
		System.out.println("win");
		
	}

}
