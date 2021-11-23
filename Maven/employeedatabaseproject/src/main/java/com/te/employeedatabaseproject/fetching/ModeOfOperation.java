package com.te.employeedatabaseproject.fetching;

import java.util.Scanner;

import com.te.employeedatabaseproject.module.InsertEmployeeDetails;

public class ModeOfOperation {
	
	public static void modeOfOperations(Scanner sc) {

		System.out.println("Choose the mode of operation");
		System.out.println("1.Insert New employee datas");
		System.out.println("2.Fetching the data from database");
		System.out.println("3.Deleting the records");
		System.out.println("4.Update the records");
		System.out.println("5 Exit");
		
		Integer code = sc.nextInt();

		switch (code) {

		case 1:
			InsertEmployeeDetails.insertDatas(sc);
			break;

		case 2:
			FetchingDatas.fetchDatas();
			break;
		case 3:
			DeletingOperation.delete(sc);
			break;

		case 4:
			UpdateDetails.update(sc);
			break;

		case 5:
			System.out.println("Database Modified");
			System.exit(0);
			break;

		default:
			System.out.println("Invalid Inputs");
		}
	}

}


