import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Practice {
	
	// you can propagate exception after method declaration using throws keyword
	public void getData(int a, int b, String fileName) { 

		try {
			System.out.println(divide(a, b));
		} catch (Exception e) {
			System.out.println("divide by zero not possible");

		}

		fileReader(fileName);

	}

	public int divide(int a, int b) {
		System.out.println(a / b);
		return 0;

	}

	public void fileReader(String fileName) {
		File file = new File("C:\\Users\\subas\\OneDrive\\Desktop\\text.txt");
		try {
			Scanner scanner = new Scanner(file);

			while (scanner.hasNext()) {
				System.out.println(scanner.nextLine());

			}
			scanner.close();
		} catch (FileNotFoundException e) {

		}
        System.out.println("class path name " +file.getParentFile());
        System.out.println("absolute path of the class "+file.getAbsolutePath());
        System.out.println("showing the length in bytes "+file.length());
        file.delete();
       
	}

}
