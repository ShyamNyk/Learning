package com.shyam.learning.serialization;

/*Serializable is a marker interface (has no data member and method). 
It is used to "mark" Java classes so that the objects of these classes may get a 
certain capability.*/

// The String class and all the wrapper classes implement the java.io.Serializable interface by default.

import java.io.Serializable;

public class Student implements Serializable {

	public transient String variable1; // null as transient are not serialized
	public transient String variable2 = "v2"; // null as transient are not serialized
	public static String variable3; // null as static variable won't participate in serialization
	public static String variable4 = "v4"; // not null as static variables are serialized only if the value is
											// initialized during the declaration

	public transient static String variable5; // null as both static and transient and values is not initialized during
												// declaration
	public transient static String variable6 = "v6"; // not null - static takes precedence and value is initialized
	final String variable7 = "v7"; // not null as final variables will be serialized
	transient final String variable8 = "v8"; // not null as final takes precedence
	transient final String variable9;

	public Student(String variable1, String variable2, String variable9) {
		super();
		this.variable1 = variable1;
		this.variable2 = variable2;
		this.variable9 = variable9;
	}


}

// Java Serialization with array or collection
// Rule: In case of array or collection, all the objects of array or collection 
// must be serializable. If any object is not serialiizable, 
// serialization will be failed.
