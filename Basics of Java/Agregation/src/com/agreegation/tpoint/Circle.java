package com.agreegation.tpoint;

public class Circle {
	Operation op;// agregation
	double pi = 3.14;

	double area(int radius) {
		op = new Operation();
		int sroot = op.sqr(radius);
		return pi * sroot;

	}

}
