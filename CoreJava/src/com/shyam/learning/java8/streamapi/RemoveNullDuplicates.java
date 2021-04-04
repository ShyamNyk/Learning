package com.shyam.learning.java8.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveNullDuplicates {

	public static void main(String args[]) {

		// Create the list with null values
		List<String> list = new ArrayList<>(
				Arrays.asList("Geeks", "Geeks", "", null, "forGeeks", null, "A computer portal"));

		// Print the list
		System.out.println("Initial List: " + list);

		// Removing nulls using Java Stream
		list = list.stream().filter(x -> x != null).collect(Collectors.toList());
		System.out.println("Modified List: " + list);

		// Removing blanks
		list = list.stream().filter(x -> x != null && !x.isEmpty()).collect(Collectors.toList());
		System.out.println("Modified List: " + list);

		// Removing Duplicates
		list = list.stream().filter(x -> x != null && !x.isEmpty()).distinct().collect(Collectors.toList());
		System.out.println("Modified List: " + list);

		// Sort the list
		list = list.stream().filter(x -> x != null && !x.isEmpty()).distinct().sorted().collect(Collectors.toList());
		System.out.println("Modified List: " + list);
	}

}
