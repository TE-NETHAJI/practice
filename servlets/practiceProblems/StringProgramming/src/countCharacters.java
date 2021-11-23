
public class countCharacters {
 // ToDo : to count the total number of characters string
	
	public static void main(String[] args) {
		String s1 = new String ("helloworld");
		int count = 0;
		for (int i = 0; i < s1.length(); i++) 
			 count++;
		System.out.println(count);
	}
}
