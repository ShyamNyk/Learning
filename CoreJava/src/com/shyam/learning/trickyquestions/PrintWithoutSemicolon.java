package com.shyam.learning.trickyquestions;

public class PrintWithoutSemicolon {

	public static void main(String[] args) {

		if (System.out.printf("HELLO-JAVA\n") == null) {
			System.out.println("Inside");
		}

		if (System.out.append("HELLO-JAVA\n").equals(null)) {
			System.out.println("Inside");
		}

		if (System.out.printf("Hello World\n") != null) {
			System.out.println("Inside");
		}

		System.out.println();

		System.out.println(System.out.printf("Hello World"));
		

	}

}

/*
 * The printf is part of the java.io.PrintStream class and provides String formatting 
 * similar to the printf() function in C.
 * System.out.print() and System.out.println() take a single argument, but
 * printf() may take multiple arguments.
 * System.out.format() is equivalent to printf() and can also be used
 * The return type of Printf method is the formatted string
 */