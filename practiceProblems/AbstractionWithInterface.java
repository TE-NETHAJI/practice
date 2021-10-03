  //Ascessing the method members from different class in same pakage

public interface InterfaceA {
	void math();

	void name();

}

public class Interfsample implements InterfaceA {

	@Override
	public void math() {
		System.out.println("im math method");

	}

	@Override
	public void name() {
		System.out.println("im nethaji");

	}

}

public class TestInterface extends Interfsample {

	public static void main(String[] args) {
		
		InterfaceA obj = new TestInterface();
		TestInterface obj1 =(TestInterface) obj;
		
		obj1.math();
		obj1.name();
		obj.math();
		obj.name();
	}

}
