package com.shyam.learning.oops;

public class AbstractExample extends AbstractExampleclass {


	public static void main(String args[]) {

	}

	@Override
	public void print() {
		System.out.println("abc");
		
	}

}

// Abstract class can have constructors, static methods, final methods, even main method
// But it can't be instantiate

abstract class AbstractExampleclass {

	int a;

	AbstractExampleclass() {

	}

	public void display() {
		System.out.println("");
	}

	abstract public void print();

	final void display1() {
		System.out.println("");
	}

	public static void main(String args[]) {
		// you can access other static method here withour instantiation
	}

}
