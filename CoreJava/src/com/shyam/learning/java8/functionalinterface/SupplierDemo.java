package com.shyam.learning.java8.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

// This can be used where there is no input but an output is expected
// T get()

public class SupplierDemo {

	public static void main(String args[]) {

		// Supplier<String> supplier = new Supplier<String>() {
		// public String get() {
		// return "Hi hello";
		// }
		// };

		Supplier<String> supplier = () -> {
			return "nothing  found";
		};
		//System.out.println(supplier.get());

		// If you are doing some condition check and want to return dummy data in case
		// you dont't find any valid result, it can be used

		// List<String> list = Arrays.asList("a", "b");
		List<String> list = Arrays.asList();

		System.out.println(list.stream().findAny().orElseGet(supplier));

		System.out.println(list.stream().findAny().orElseGet(()->"nothing found"));

	}

}
