public class Main {
	public static void main(String[] args) {
		int n01 = 12;
		int n02 = 30;
		System.out.println("GCD is: " +gcd(n01,n02));
		//Eucleadien Algorithm
	}

	static int gcd(int n01, int n02) {
		if (n01 == 0 || n02 == 0)
			return 0;
		if (n01 == n02)
			return n01;
		if (n01 > n02)
			return gcd(n01 - n02, n02);
		else
			return gcd(n01, n02 - n01);

	}
}