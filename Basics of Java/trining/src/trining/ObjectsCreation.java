package trining;
/*
 * There are five different ways to create an object in Java:
 * 
 * Java new Operator Java Class.newInstance() method Java newInstance() method
 * of constructor Java Object.clone() method Java Object Serialization and
 * De-serialization
 */

public class ObjectsCreation {
	String str = "hello TechnoElevate";
	
public static void main(String[] args) {
	ObjectsCreation obj1 = new ObjectsCreation();
	System.out.println(obj1.str);
	
	try {
		ObjectsCreation obj= ObjectsCreation.class.newInstance();
		System.out.println(obj.str);
	} catch (InstantiationException e) {

		e.printStackTrace();
	} catch (IllegalAccessException e) {
		
		e.printStackTrace();
	}
	
	/*  De-serialization =
	 * ClassNotFoundException: If the class of serialized is not found.
	 * InvalidClassException: Something is wrong with a class used by serialization.
	 * IOException: Any of the usual Input/Output related exception.
	 * OptionalDataException: If primitive data was found in the stream instead of
	 * objects
	 */
	/*
	 * The newInstance() method throws the following Exception:
	 * 
	 * IllegalAccessException: If the constructor is inaccessible.
	 * IllegalArgumentException: If the actual and formal parameter differ in
	 * number. InstantiationException: If the class constructor represents an
	 * abstract class. InvocationTargetException: If the underlying constructor
	 * throws an exception. ExceptionInInitializerError: If the initialization
	 * provoked by this method fails.
	 */
}
	
}
