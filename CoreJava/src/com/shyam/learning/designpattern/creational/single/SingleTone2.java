package com.shyam.learning.designpattern.creational.single;

//Java code to create singleton class 
//Using Static block 
public class SingleTone2 {

	private static SingleTone2 obj;

	private SingleTone2() {

	}

	static {
		obj = new SingleTone2();
	}

	public SingleTone2 getInstance() {
		return obj;
	}
}

//Pros:
//Very simple to implement.
//No need to implement getInstance() method. Instance can be accessed directly.
//Exceptions can be handled in static block.
//Cons:
//May lead to resource wastage. Because instance of class is created always, whether it is required or not.
//CPU time is also wasted in creation of instance if it is not required.
