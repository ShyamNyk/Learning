package com.shyam.learning.mcq;

import com.shyam.learning.HelioCentric;

public class Ambigous {

	public static void main(String[] args) {

		Ambigous ambObj = new Ambigous();
		ambObj.display(null);

	}

	public void display(Object obj) {
		System.out.println(" Object " + obj);
	}

	public void display(String str) {
		System.out.println("String : " + str);
	}

	/*
	 * public void display(Integer variable) { System.out.println(" Integer " +
	 * variable); }
	 * 
	 * public static void display(char[] obj) { System.out.println("Array called");
	 * }
	 */

}

//Solution
//doSomething( (Object) null);
//doSomething( (Integer) null);
//doSomething( (char[]) null);

/*
 * It's because of method Overloading The most specific method is chosen at
 * compile time. As 'java.lang.String' is a more specific type than
 * 'java.lang.Object'. In your case it returns String
 */

