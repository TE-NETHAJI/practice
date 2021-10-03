
public class ReversString {

	public static void main(String[] args) {

		String input = "Nethaji";
		System.out.println(reverse(input));
	}

	public static String reverse(String input) {
		if (input == null)
			throw new IllegalArgumentException("Null is not valid input");

		StringBuilder out = new StringBuilder();

		char[] chars = input.toCharArray();

		for (int i = chars.length - 1; i >= 0; i--)
			out.append(chars[i]);

		return out.toString();
	}

}