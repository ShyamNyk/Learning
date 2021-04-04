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

/*
 * Here we have declared getInstance() static so that we can call it without
 * instantiating the class. The first time getInstance() is called it creates a
 * new singleton object and after that it just returns the same object. Note
 * that Singleton obj is not created until we need it and call getInstance()
 * method. This is called lazy instantiation.
 */

//Pros:
//Object is created only if it is needed. It may overcome resource overcome and wastage of CPU time.
//Exception handling is also possible in method.
//Cons:
//Every time a condition of null has to be checked.
//instance can’t be accessed directly.
//In multithreaded environment, it may break singleton property. It is not thread safe