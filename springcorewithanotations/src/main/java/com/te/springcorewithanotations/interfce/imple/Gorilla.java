package com.te.springcorewithanotations.interfce.imple;

import com.te.springcorewithanotations.interfaces.Animal;

public class Gorilla implements Animal {

	@Override
	public void eat() {
		System.out.println("eats banana");
		
	}

	@Override
	public void sound() {
		System.out.println("koraaaaa");
		
	}

	@Override
	public void type() {
		System.out.println("ominivorous");
		
	}

}
