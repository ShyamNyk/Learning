package com.shyam.learning.java8.functionalinterface;

import java.util.function.Predicate;

// This is used for Conditional check
// In case, we have functions that return true/false in the programme, we can use it.
// boolean Test(T t)

public class PredicateDemo {

	public static void main(String args[]) {
		Predicate<Integer> predicate = new Predicate<Integer>() {
			public boolean test(Integer t) {
				if (t % 2 == 0)
					return true;
				else
					return false;
			}
		};
		System.out.println(predicate.test(12));
		System.out.println(predicate.test(11));

	}

}
