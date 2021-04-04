package com.shyam.learning.designpattern.creational.single.breakcode;

import java.io.Serializable;

//Java code to create singleton class by  
//Eager Initialization 
public class SingleToneSerializable implements Serializable{

	// public instance initialized when loading the class
	public static SingleToneSerializable obj = new SingleToneSerializable();

	private SingleToneSerializable() {
		// private constructor
	}

	public static SingleToneSerializable getInstance() {
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