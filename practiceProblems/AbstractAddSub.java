class TestA extends TestAbstract {
	public static void main(String[] args) {

		addition(10, 10);
		subtraction(20, 10);
	}

}

public abstract class TestAbstract {
	public static void addition(int a, int b) {
		System.out.println(a + b);
	}

	public static void subtraction(int a, int b) {
		System.out.println(a - b);
	}
}
