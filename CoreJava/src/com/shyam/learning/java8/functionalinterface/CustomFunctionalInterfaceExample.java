package com.shyam.learning.java8.functionalinterface;

@FunctionalInterface
interface CustomFunctionalInterface {
	void display();
}

public class CustomFunctionalInterfaceExample {

	public static void main(String args[]) {

		// Using Anonymous inner class
		CustomFunctionalInterface obj1 = new CustomFunctionalInterface() {
			public void display() {
				System.out.println("Display using annonymus inner class");
			}
		};
		obj1.display();

		CustomFunctionalInterface obj2 = () -> {
			System.out.println("Display using lambda expression");
		};
		obj2.display();

	}

}
