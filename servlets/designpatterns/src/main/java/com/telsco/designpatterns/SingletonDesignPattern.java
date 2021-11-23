package com.telsco.designpatterns;

public class SingletonDesignPattern {

	public static void main(String[] args) {
		Abc obj = Abc.INSTANCE;
		obj.i = 10;
		obj.getInstance();

		Abc obj1 = Abc.INSTANCE;
		obj1.i = 11;
		obj1.getInstance();

	}

	enum Abc {
		INSTANCE;

		int i;

		public void getInstance() {
			System.out.println("Value :"+i);
		}
	}

}
