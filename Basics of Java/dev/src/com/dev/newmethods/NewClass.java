package com.dev.newmethods;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.*;


public class NewClass {

	public static void main(String[] args) {
		System.out.println("--------mainStarts------");
		
		List<String> s = new ArrayList<>();
		s.add("nethaji");
		s.add("naveen");
		s.add("dev");
		s.add("muthu");
		
		
		Iterator<String> itr =s.iterator();
		
		s.forEach((a) ->{
			System.out.println(a);
		});
		System.out.println("============================");
		itr.forEachRemaining( (w)->{
			System.out.println(w);
		});
	   
	    	
	   
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("hello stupids");
			}
		}).start();
		
		new Thread(()->{
			System.out.println("Hello from lambda");
		}).start();
		
		
		
		System.out.println("--------mainEnds---------");
		
		
	}

}
