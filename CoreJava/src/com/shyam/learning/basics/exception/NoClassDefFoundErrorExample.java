package com.shyam.learning.basics.exception;

/*NoClassDefFoundError occurs when class was present during compile time and 
program was compiled and linked successfully but class was not present during 
runtime. It is error which is derived from LinkageError. Linkage error occurs 
when a class has some dependencies on another class and latter class changes 
after compilation of former class. NoClassFoundError is the result of implicit 
loading of class because of calling a method or accessing a variable from that 
class. This error is more difficult to debug and find the reason why this error 
occurred. So in this case you should always check the classes which are dependent 
on this class.


Below program will be successfully compiled and generate two classes GeeksForGeeks1.class and NoClassDefFoundErrorExample.class .
Now remove GeeksForGeeks.class file and run G4G.class.
At Java runtime NoClassDefFoundError will be thrown.

Note: This program will not run on IDE. Try to run it on your own systems.*/

class GeeksForGeeks1  
{ 
    void greeting() 
    { 
        System.out.println("hello!"); 
    } 
} 
public class NoClassDefFoundErrorExample {

	  public static void main(String args[])  
	    { 
	        GeeksForGeeks1 geeks = new GeeksForGeeks1(); 
	        geeks.greeting(); 
	    } 
	
}

/*
 * ClassNotFoundException Vs NoClassDefFoundError
 * 
 * As the name suggests, ClassNotFoundException is an exception while
 * NoClassDefFoundError is an error. ClassNotFoundException occurs when
 * classpath is does not get updated with required JAR files while error occurs
 * when required class definition is not present at runtime.
 */
