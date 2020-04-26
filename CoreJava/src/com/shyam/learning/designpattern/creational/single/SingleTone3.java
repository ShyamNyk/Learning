package com.shyam.learning.designpattern.creational.single;

//Lazy initialization: In this method, object is created only if it is needed
//There is a null check that if object is not created then create, otherwise return previously created.
public class SingleTone3 {

	private static SingleTone3 obj;

	private SingleTone3() {
		// private constructor
	}

	// method to return instance of class
	public static SingleTone3 getInstance() {
		if (obj == null) {
			// if instance is null, initialize
			obj = new SingleTone3();
		}
		return obj;
	}
}

//Pros:
//Object is created only if it is needed. It may overcome resource overcome and wastage of CPU time.
//Exception handling is also possible in method.
//Cons:
//Every time a condition of null has to be checked.
//instance can’t be accessed directly.
//In multithreaded environment, it may break singleton property.