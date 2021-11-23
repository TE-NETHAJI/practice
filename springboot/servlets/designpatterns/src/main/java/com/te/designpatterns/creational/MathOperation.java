package com.te.designpatterns.creational;

public class MathOperation {
	private MathOperation() {
		
	}
	
	static MathOperation mathoperation = null;
	
	public static MathOperation  getMathObj() {
		if(mathoperation == null) {
			mathoperation = new MathOperation();
			
		}
		return mathoperation;
	
	}

}
