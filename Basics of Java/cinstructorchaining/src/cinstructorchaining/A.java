package cinstructorchaining;

public class A extends B {

	A() {
		super(2, 3);
		//System.out.println("hello");
	}

	void math() {
		System.out.println("hi downcasting");
	}

	public static void main(String[] args) {

		B obj = new A(); // upcasting
		A obj1 = (A) obj; // downcasting
		//obj1.math();

	}
}
