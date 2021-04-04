package com.shyam.learning.java8.optional;

import java.util.Optional;

//t is a public final class and used to deal with NullPointerException in Java

public class OptionalExample {

	public static void main(String args[]) {

		String[] str = new String[10];
		// The below code would throw exception
		// String lowercaseString = str[5].toLowerCase();
		// System.out.print(lowercaseString);

		// To avoid the above issue, we can use Optional class

		Optional<String> checkNull = Optional.ofNullable(str[5]);
		if (checkNull.isPresent()) {
			String lowercaseString = str[5].toLowerCase();
			System.out.print(lowercaseString);
		} else {
			System.out.println("Element is not present");
		}

	}

}
