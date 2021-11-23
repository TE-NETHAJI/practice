import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class ClassLoader{
	public static void main(String[] args) {
		
		try {
			File file = new File("C:\\Users\\subas\\OneDrive\\Desktop\\text.txt");
			Scanner scanner = new Scanner(file);
			
			while(scanner.hasNext()) {
				System.out.println(scanner.nextLine());
				
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	}

}
