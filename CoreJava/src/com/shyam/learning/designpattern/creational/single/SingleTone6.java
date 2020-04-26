package com.shyam.learning.designpattern.creational.single;
//Bill Pugh Singleton Implementation: Prior to Java5, memory model had a lot of issues and above methods caused failure in certain scenarios in multithreaded environment. So, Bill Pugh suggested a concept of inner static classes to use for singleton.

// Java code for Bill Pugh Singleton Implementaion 
public class SingleTone6 {

	private SingleTone6() {
		// private constructor
	}

	// Inner class to provide instance of class
	private static class BillPughSingleton {
		private static final SingleTone6 OBJ = new SingleTone6();
	}

	public static SingleTone6 getInstance() {
		return BillPughSingleton.OBJ;
	}
}