package com.shyam.learning.oops;

import java.io.IOException;

//You can change the return type in method overloading but that does not matter for method overloading
//Throwing any exception in method overloading does not matter unlike method overriding

// If we overload static methods, it is called compile time polimorphism

// you can overload static methods

//Two methods with one as static and one normal instance method are 
//also not considered to be overloaded methods, throws compile time error

//
public class MethodOverloading {

	public void display(String a, String b) throws IOException {
		System.out.println(a + " " + b);
	}

	public void display(String a, String b, String c) {
		System.out.println(a + " " + b + " " + c);
	}

	// Changing return type is possible but the argument has to be different
	public String display(String str) {
		return str;
	}

	// You can use static also , that does not matter
	public static String display(int a) {
		return String.valueOf(a);
	}

	public static void main(String[] args) throws IOException {
		MethodOverloading obj = new MethodOverloading();
		obj.display("shyam", "Sundar");
		obj.display("shyam", "Sundar", "Nayak");
		System.out.println(obj.display("shyam"));
		System.out.println(obj.display(3));
	}

}
