package com.shyam.learning.enums;
//  Enumeration (or enum) is a user-defined data type

// It is mainly used to assign names to integral constants, the names make a program easy to read and maintain
// Java compiler internally creates a static and final class for the enum.
public class EnumExample1 {

	// defining the enum inside the class
	public enum Season {
		WINTER, SPRING, SUMMER, FALL
	}; // semicolon is optional here

	// main method
	public static void main(String args[]) {

		for (Season s : Season.values()) {
			System.out.println(s);
		}

		System.out.println("Value of WINTER is: " + Season.valueOf("WINTER"));
		System.out.println("Index of WINTER is: " + Season.valueOf("WINTER").ordinal());
		System.out.println("Index of SUMMER is: " + Season.valueOf("SUMMER").ordinal());
	}
	
// What is the purpose of the values() method in the enum?
//	The Java compiler internally adds the values() method when it creates an enum. The values() method returns an array containing all the values of the enum.

	

}
