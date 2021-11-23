package com.te.module.fileHandling;

import java.io.File;
import java.util.Scanner;

public class FileHandling {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the path where you want to create the folder:");
		String path = sc.next();
		path = path + ":\\";
		//System.out.println(path);
		System.out.println("Enter the Folder Name:");
		path += sc.next();
		//System.out.println(path);
		File f = new File(path);
		sc.close();
		if (f.mkdir()) {
			System.out.println("Folder Created Successfully");
		} else {
			throw new RuntimeException("Not a Legitamite path!!! File Not Created!!!");
		}

	}
}
