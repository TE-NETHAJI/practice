package com.company.module.exception;



public class ClassLoader {
	public static void main(String[] args) {
			
		try {
			ClassLoader c = ClassLoader.class.newInstance();
			ClassLoader c1 = (ClassLoader) Class.forName(ClassLoader.class.getCanonicalName()).newInstance();
			System.out.println(c.getClass().getSimpleName());
			System.out.println(c1);
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
		
			e.printStackTrace();
		}
	
	
		System.out.println("employee");
		System.out.println("loaded sucessfully");
	}

}
