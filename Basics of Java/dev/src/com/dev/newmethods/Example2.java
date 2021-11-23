package com.dev.newmethods;

public class Example2 extends Example {
	public static void main(String[] args) {
		
		/*
		 * public void getData() { System.out.println("hello from "); }
		 */
		//Example2 a = new Example2();
		A a = new Example();
		B b = new Example();
		//B b = new Example();
		//a.display();
		a.display();
		System.out.println(b.display2());
		Example ex = new Example();
		ex.displayExample();
		
		Example2 ex2 = new Example2();
		Example ex1 = (Example) a;
		a.math();
	
		
	}

}
