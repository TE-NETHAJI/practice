package methodOverloadingriding;

public class C extends B {

	@Override
	public void maths(int a, int b) {
		System.out.println(a - b);
		//super.maths(a, b);
	}

	@Override
	public void maths(int a, double b) {
		//this.maths(2,3);
		System.out.println(a - b);
		//super.maths(a, b);
	}

}
