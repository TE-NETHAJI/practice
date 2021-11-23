package com.dev.newmethods;

import java.io.FileInputStream;
import java.io.IOException;

public class Exception1 {
	public static void main(String[] args)  {
		try {
			int a= 0;
			int b=10;
			int c =b/a;
			System.out.println(c);
			
		}catch (Exception e) {
			System.out.println("Arithmetic Exception");
		}
		
		FileInputStream f;
		try {
			f = new FileInputStream("sdhlifkhfhdi");
			f.close();
		} catch (IOException e) {
			
			System.out.println(e.getMessage());
		}
	}
}
