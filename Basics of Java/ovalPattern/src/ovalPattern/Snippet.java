package ovalPattern;

public class Snippet {
	public static void main(String[] args) {
		int n = 2;
		int s = 2 * n + 1;
		for (int i = 1; i <= s; i++) {
			for (int j = 1; j <= s; j++) {
				if (i == j || (i + j) == (s + 1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}
}
