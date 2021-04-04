package com.shyam.learning.basics.operators;

/*instanceof operator and isInstance() method both are used for checking the 
class of the object. But main difference comes when we want to check the class 
of object dynamically. In this case isInstance() method will work. 
There is no way we can do this by instanceof operator.*/

/*instanceof operator and isInstance() method both return a boolean value. 
isInstance() method is a method of class Class in java while instanceof is a 
operator.
*/
public class IsInstanceInstanceOf {

	public static void main(String args[]) throws ClassNotFoundException {

		IsInstanceInstanceOf obj = new IsInstanceInstanceOf();

		System.out.println(obj instanceof IsInstanceInstanceOf);
		Integer i = 10;
		System.out.println(i instanceof Integer);
		// System.out.println(i instanceof String); - compile time error

		Integer j = new Integer(5);

		// print true as i is instance of class
		// Integer
		boolean b = fun(j, "java.lang.Integer");

		// print false as i is not instance of class
		// String
		boolean b1 = fun(j, "java.lang.String");

		/*
		 * print true as i is also instance of class Number as Integer class extends
		 * Number class
		 */
		boolean b2 = fun(j, "java.lang.Number");

		System.out.println(b);
		System.out.println(b1);
		System.out.println(b2);

	}

	// This method tells us whether the object is an
	// instance of class whose name is passed as a
	// string 'c'.
	public static boolean fun(Object obj, String c) throws ClassNotFoundException {
		return Class.forName(c).isInstance(obj);
	}

}
