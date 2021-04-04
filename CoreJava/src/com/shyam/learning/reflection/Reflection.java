package com.shyam.learning.reflection;

/*Java Reflection is quite powerful and can be very useful. Java Reflection makes 
it possible to inspect classes, interfaces, fields and methods at runtime, 
without knowing the names of the classes, methods etc. at compile time. 
It is also possible to instantiate new objects, invoke methods and get/set 
field values using reflection.
*/

/*The java.lang.Class class performs mainly two tasks:

provides methods to get the metadata of a class at run time.
provides methods to examine and change the run time behavior of a class.*/

class Simple {
}

public class Reflection {

	void printName(Object obj) {
		Class c = obj.getClass();
		System.out.println(c.getName());
	}

	public static void main(String args[]) {
		Simple s = new Simple();

		Reflection t = new Reflection();
		t.printName(s);
	}
}

// public String getName()	- returns the class name
// Class forName(String className)throws ClassNotFoundException - loads the class and returns the reference of Class class
// public boolean isInterface() - checks if it is an interface
// public boolean isArray() - checks if it is an array
// public boolean isArray() - checks if it is primitive
