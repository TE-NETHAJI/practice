
package com.dev.newmethods;

public class Example implements A, B {
	
	public void displayExample() {
		System.out.println("from example");
	}
	

	@Override
	public int display2() {
		int a = 12*12;
		System.out.println(a);
		return a;
	}

	@Override
	public void display() {
		System.out.println("from interface A");
		
	}
	

}
