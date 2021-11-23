package com.dev.newmethods;

public interface A {
	
	public void display();
	

    
	public default void math() {
		System.out.println("Hello from math");
	}
}
