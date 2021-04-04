package com.shyam.learning.java8.functionalinterface;

public class MyFunctionalInterfaceDemo {

	public static void main(String args[]) {

		MyFunctionalInterface obj = new MyFunctionalInterface() {
			public int calculate(int x) {
				return x * x;
			}
		};
		System.out.println(obj.calculate(5));
		
		MyFunctionalInterface obj1 = (x)->x*x;
		System.out.println(obj.calculate(6));
		
	}
}

@FunctionalInterface
interface MyFunctionalInterface {

	public int calculate(int x);
}
