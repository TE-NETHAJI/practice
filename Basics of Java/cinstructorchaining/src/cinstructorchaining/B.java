package cinstructorchaining;

public class B {
	B() {
		System.out.println("hi");
	}

	public B(int a, int b) {
		this();
		System.out.println(a * b);
	}
}
