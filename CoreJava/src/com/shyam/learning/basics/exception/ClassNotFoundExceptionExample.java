package com.shyam.learning.basics.exception;

/*ClassNotFoundException occurs when you try to load a class at runtime using 
Class.forName() or loadClass() methods and requested classes are not found in 
classpath. Most of the time this exception will occur when you try to run 
application without updating classpath with JAR files. 
This exception is a checked Exception derived from java.lang.Exception class 
and you need to provide explicit handling for it*/


//Java program to illustrate 
//ClassNotFoundException
public class ClassNotFoundExceptionExample {

	public static void main(String args[]) {
		try {
			Class.forName("GeeksForGeeks");
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}
	}
}
