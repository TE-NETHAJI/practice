package com.te.FileHandling.using.csv;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CSVFile {
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner scanner = new Scanner(new File("E:\\.csv"));
		scanner.useDelimiter(" ,");
		while (scanner.hasNext()) {
			System.out.println(scanner.next());
			
		}
		scanner.close();
		
	}

}
