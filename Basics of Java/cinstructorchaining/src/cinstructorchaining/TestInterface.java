package cinstructorchaining;

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
