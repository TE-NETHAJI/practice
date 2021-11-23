package com.te.designpatterns.behavoiurdp;

public interface Game {
	
	public void start();
	
	public void init();
	
	public void end();
	
	public default void play() {
		start();
		init();
		end();
		
	}
	

}
