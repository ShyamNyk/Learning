package com.shyam.learning.generics;

// Generics also provide compile-time type safety that allows programmers 
// to catch invalid types at compile time
// Type safety, compile time checking, type casting is not required

import java.util.ArrayList;
import java.util.Iterator;

public class TypeSafetyExample {

	public static void main(String args[]) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("rahul");
		list.add("jai");
		// list.add(32);//compile time error

		String s = list.get(1);// type casting is not required
		System.out.println("element is: " + s);

		// Why do we need Type safety ?
		// Creating an ArrayList without any type specified
		ArrayList al = new ArrayList();
		al.add("Sachin");
		al.add("Rahul");
		al.add(10); // Compiler allows this
		String s1 = (String) al.get(0);
		String s2 = (String) al.get(1);
		// Causes Runtime Exception
		String s3 = (String) al.get(2); // Issue here 
		// Generics solve this problem
		// Creating a an ArrayList with String specified 
        ArrayList <String> al1 = new ArrayList<String> (); 
	}

}
