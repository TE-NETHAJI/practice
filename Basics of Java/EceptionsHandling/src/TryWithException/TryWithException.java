package TryWithException;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

public class TryWithException {
	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in); FileOutputStream stream = new FileOutputStream(new File(""));) {
			scanner.hasNext();
		} catch (Exception e) {

			String s1 = e.getMessage();
			System.out.println(s1);

		}
	}
}
