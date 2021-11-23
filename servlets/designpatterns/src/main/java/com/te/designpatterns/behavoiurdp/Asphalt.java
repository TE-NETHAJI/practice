package com.te.designpatterns.behavoiurdp;

public class Asphalt implements Game {

	@Override
	public void start() {
		System.out.println("Asphalts 9 starting....");
		
	}

	@Override
	public void init() {
		System.out.println("cars are loading");
		
	}

	@Override
	public void end() {
		System.out.println("win win");
		
	}

}
