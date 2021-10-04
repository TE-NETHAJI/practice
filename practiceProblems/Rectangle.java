package com.te.question6;

public class Rectangle extends Square{
	float area;
	float perimeter;
	public float areaRectangle(float length, float breadth) {
		if (length == breadth) {
			
			return super.areaSquare(length);
		}else {
			this.area = length*breadth;
			return this.area;
			
		}
	}
	
	public float perimeterRectangle(float length, float breadth) {
		if (length == breadth) {
			
			return super.perimeterSquare(length);
		}else {
			this.perimeter = 2*(length+breadth);
			return this.perimeter;
			
		}
	}
}
