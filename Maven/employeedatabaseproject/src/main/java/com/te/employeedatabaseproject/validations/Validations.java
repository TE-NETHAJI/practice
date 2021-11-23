package com.te.employeedatabaseproject.validations;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.te.employeedatabaseproject.driver.ReturnMethod;
import com.te.employeedatabaseproject.exceptions.InvalidInputGiven;

public class Validations {
	public static void name(Scanner sc) throws InvalidInputGiven {
		if (sc.hasNext("[A-Za-z]+")) {
			sc.nextLine();
		} else {
			throw new InvalidInputGiven("Name should only be in Alphabets");
		}

	}

	public static boolean isValidNumber(String no) {
		Pattern ptrn = Pattern.compile("(0/91)?[7-9][0-9]{9}");
		Matcher match = ptrn.matcher(no);
		return (match.find() && match.group().equals(no));
	}

}
