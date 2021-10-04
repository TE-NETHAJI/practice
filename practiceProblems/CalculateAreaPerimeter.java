package com.te.question6;

public class CalculateAreaPerimeter {

	public static void main(String[] args) {
		float length = 5;
		float breadth = 5;
		Rectangle r = new Rectangle();
		System.out.println("The Area is :" + r.areaRectangle(length, breadth));
		System.out.println("The Perimeter is :" + r.perimeterRectangle(length, breadth));

	}

}
