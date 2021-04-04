package com.shyam.learning.oops;

// Encapsulation in Java is a mechanism of wrapping the data (variables) and code 
// acting on the data (methods) together as a single unit.

// In encapsulation, the variables of a class will be hidden from other classes, 
// and can be accessed only through the methods of their current class. 
// Therefore, it is also known as data hiding.

//To achieve encapsulation in Java −
//Declare the variables of a class as private.
//Provide public setter and getter methods to modify and view the variables values.

/*Encapsulation can be achieved by Declaring all the variables in the class as private 
 *and writing public methods in the class to set and get the values of variables.
 *The Java Bean class is the example of a fully encapsulated class*/

//Java program to demonstrate encapsulation 
public class Encapsulate {
	// private variables declared
	// these can only be accessed by
	// public methods of class
	private String geekName;
	private int geekRoll;
	private int geekAge;

	// get method for age to access
	// private variable geekAge
	public int getAge() {
		return geekAge;
	}

	// get method for name to access
	// private variable geekName
	public String getName() {
		return geekName;
	}

	// get method for roll to access
	// private variable geekRoll
	public int getRoll() {
		return geekRoll;
	}

	// set method for age to access
	// private variable geekage
	public void setAge(int newAge) {
		geekAge = newAge;
	}

	// set method for name to access
	// private variable geekName
	public void setName(String newName) {
		geekName = newName;
	}

	// set method for roll to access
	// private variable geekRoll
	public void setRoll(int newRoll) {
		geekRoll = newRoll;
	}
}