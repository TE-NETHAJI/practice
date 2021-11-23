package methodOverloadingriding;

public class B {
	/*
	 * B(){ System.out.println("hi"); }
	 */
	public void maths(int a, int b) {
		System.out.println(a + b);

	}

	public void maths(int a, double b) {
		System.out.println(a + b);

	}

}
