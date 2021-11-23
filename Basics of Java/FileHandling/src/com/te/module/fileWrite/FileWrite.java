package com.te.module.fileWrite;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWrite {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
			String path = "E:\\test.txt";
			char choice;
			choice = scanner.next();
			if(new File(path).exists()) {
				System.out.println("The file is already exists do you wanna override? Y/N");
			}
			else{(choice == 'Y' || choice == 'Y' || !new File(path).exists()) {
					FileWriter myWriter = new FileWriter(path);
					myWriter.write("hi");
					myWriter.close();
					System.out.println("Successfully wrote to the file.");
				}
			}
		}
}

	
			
					
			
