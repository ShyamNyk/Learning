package com.shyam.learning.strings;

//String pool is also example of Flyweight design pattern.

public class StringPool {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "World";
		String str3 = new String("HelloWorld"); // creates two objects and one reference variable
		String str4 = str1 + str2;
		System.out.println(str3.equals(str4));
		System.out.println(str3==str4);
		String str5 = str1 + str2;
		String str6 = str1.concat(str2);
		System.out.println(str5 == str6);
		System.out.println(str5.equals(str6));

		String str7 = "HelloWorld";
		String str8 = "HelloWorld";

		// How many Objects
		String str = "a" + "b";
		String strO = new String("ab");

		System.out.println();
		System.out.println(str==strO);
		str = str+"c";
		System.out.println(str);
		String strO1 = "abc";
		System.out.println(str==strO1);
		System.out.println();
		

		anotherExample1();

		System.out.println("");
	}
	// Whenever concatenation of strings are done,
	// a new object is created as String in immutable
	// Concatenation creates object in the heap

	private static void anotherExample1() {
		System.out.println("Another example");
		String str1 = "Abc"; // string pool

		String str2 = "XYZ"; // string pool

		String str3 = str1 + str2; // not string pool (!!)

		String str3a = "Abc" + "XYZ"; // string pool
		System.out.println(str3a == str3);

		String str4 = new String("PQR"); // not string pool (but the "PQR" literal is)

		String str5 = str1.concat(str4); // not string pool

		String str6 = str1 + str4; // not string pool

		String str7 = str6.intern(); // string pool

		String str8 = Character.toString('a');
		String str9 = "a";
		System.out.println(str8 == str9);
		System.out.println(str8.equals(str9));
		System.out.println(str8);

	}

}
