public class StringSample {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		String str = new String();
		System.out.println("print something");
		str = scanner.next();
		System.out.println("print one more string");
		String str2 = new String();
		str2 = scanner.next();

		System.out.println("1  touppercase " + str.toUpperCase());
		System.out.println("2  tolowercase " + str.toLowerCase());
		System.out.println("3  print character at index 1 " + str.charAt(1));
		String anObject = "hello";
		System.out.println("4  comparing both are same or not returns boolean " + str.equals(anObject));
		System.out.println("5  shows the length of an String " + str.length());
		System.out.println("6  cut the String before the index value " + str.substring(1));
		System.out.println("7  trim the white space before the String " + str.trim());
		System.out.println("8  concat with a mention String " + str.concat(" how are you"));
		// System.out.println(str.split(
		System.out.println("9  replace " + str.replace("Nethaji", "Mike"));
		System.out.println("10 check wheather the letter is present or not " + str.contains("n"));
		System.out.println("11 split depend on the reference");
		for (String s : str.split("e")) {
			System.out.println(s);
		}
		System.out
				.println("12 check wheather the given string start with that particular value " + str.startsWith("n"));
		System.out.println("13 check wheather the given string is empty or not returns boolean? " + str.isEmpty());
		System.out.println("14 check two string are equals and returns boolean " + str.matches(str2));
	}
}