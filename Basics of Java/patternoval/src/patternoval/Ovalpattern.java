package patternoval;

public class Ovalpattern {
	public static void main(String[] args) {
		int n = 7;
		int str = 1;
		int spc = n / 2;
		int mid = n / 2;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= spc; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= str; k++) {
				if (k == 1 || k == str) {
					System.out.print("  *");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
			if (mid >= i) {
				str += 2;
				spc--;
			} else if (mid < i) {
				str -= 2;
				spc++;
			}
		}
	}

}
