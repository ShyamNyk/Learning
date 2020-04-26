package com.shyam.learning.designpattern.creational.single;

//Java code to create singleton class by  
//Eager Initialization 
public class SingleTone1 {

	// public instance initialized when loading the class
	public static SingleTone1 obj = new SingleTone1();

	private SingleTone1() {
		// private constructor
	}

	public SingleTone1 getInstance() {
		return obj;
	}
}

// This is eager Initialization

//Pros:
//Very simple to implement.
//Cons:
//May lead to resource wastage. Because instance of class is created always, whether it is required or not.
//CPU time is also wasted in creation of instance if it is not required.
//Exception handling is not possible.