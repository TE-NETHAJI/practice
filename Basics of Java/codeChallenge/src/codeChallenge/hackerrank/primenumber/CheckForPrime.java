package codeChallenge.hackerrank.primenumber;

import java.util.Scanner;

public class CheckForPrime {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number :");
		int number = scanner.nextInt();
		if ((number % number != 0) && (number % 1 != 0)) {
			System.out.println("The entered number is not primeNumber");

		} else {
			System.out.println("The entered number is PrimeNumber");
		}

	}
}
