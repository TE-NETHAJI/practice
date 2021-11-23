package com.te.springcorewithanotations.interfce.imple;

import com.te.springcorewithanotations.interfaces.Animal;

public class Godzilla implements Animal {

	@Override
	public void eat() {
		System.out.println("eats Animal");

	}

	@Override
	public void sound() {

		System.out.println("kooooooooo ooooooooooooooooo");
	}

	@Override
	public void type() {
		System.out.println("carnivorous");

	}

}
