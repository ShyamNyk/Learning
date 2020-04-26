package com.shyam.learning.designpattern.creational.single;

//Thread Safe Singleton: A thread safe singleton in created so that singleton property is maintained even in multithreaded environment. To make a singleton class thread-safe, getInstance() method is made synchronized so that multiple threads can’t access it simultaneously
//Java program to create Thread Safe 
//Singleton class 
public class SingleTone4 {
// private instance, so that it can be 
// accessed by only by getInstance() method 
	private static SingleTone4 obj;

	private SingleTone4() {
		// private constructor
	}

//synchronized method to control simultaneous access 
	synchronized public static SingleTone4 getInstance() {
		if (obj == null) {
			// if instance is null, initialize
			obj = new SingleTone4();
		}
		return obj;
	}
}

//Pros:
//Lazy initialization is possible.
//It is also thread safe.
//Cons:
//getInstance() method is synchronized so it causes slow performance as multiple threads can’t access it simultaneously.