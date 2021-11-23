package com.te.designpatterns.creational;

public class FactoryClass {
	
		
		public static Employee getMethod(String ch) {
			
			if(ch.equalsIgnoreCase("mgr")) {
			return new Manager();
			}
			else if(ch.equalsIgnoreCase("interns")) {
				return new Interns();
			}
			return null;
			
		}
	
	

}
