package com.shyam.learning.java8.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

// This is used for Conditional check
// In case, we have functions that return true/false in the programme, we can use it.
// boolean Test(T t)

public class PredicateDemoUsingLambda {

	public static void main(String args[]) {

		// Predicate<Integer> predicate = (t) -> {
		// if (t % 2 == 0)
		// return true;
		// else
		// return false;
		// };

		Predicate<Integer> predicate = (t) -> t % 2 == 0;

		System.out.println(predicate.test(12));
		System.out.println(predicate.test(11));

		// Filter method in Stream used predicate method

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

		list.stream().filter(predicate).forEach((t) -> System.out.println("Print even : " + t));

		// OR
		System.out.println();

		list.stream().filter((t) -> t % 2 == 0).forEach((t) -> System.out.println("Print even : " + t));

		System.out.println("Print Odd");
		list.stream().filter(p -> p % 2 != 0).forEach(p -> System.out.println("Odd : " + p));

	}

}
