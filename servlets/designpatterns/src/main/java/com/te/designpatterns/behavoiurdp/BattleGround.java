package com.te.designpatterns.behavoiurdp;

public class BattleGround implements Game {

	@Override
	public void start() {
		System.out.println("welocme to battlegroung");
		
	}

	@Override
	public void init() {
		System.out.println("there can be one winner");
	}

	@Override
	public void end() {
		System.out.println("winner winner chicken dinner");
		
	}

}
