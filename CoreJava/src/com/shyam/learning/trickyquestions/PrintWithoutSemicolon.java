package com.shyam.learning.trickyquestions;

public class PrintWithoutSemicolon {

	public static void main(String[] args) {

		if (System.out.printf("HELLO-JAVA\n") == null) {
		}

		if (System.out.append("HELLO-JAVA\n").equals(null)) {
		}

		if (System.out.printf("Hello World") != null) {
		}

		System.out.println(System.out.printf("Hello World"));

	}

}
