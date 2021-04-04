package com.shyam.learning.java8.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ArraySum {

	public static void main(String[] args) {
		int[] A = { 1, 2, 3, 4, 5 };
		int sum = Arrays.stream(A).sum();

		System.out.println("The sum of all elements in the array is " + sum);

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		Integer sum1 = list.stream().reduce(0, (a, b) -> a + b);
		System.out.println(sum1);

		Integer sum2 = list.stream().mapToInt(i -> i).sum();

		Optional<Integer> reduceSumWithMethodReference = list.stream().reduce(Integer::sum);
		System.out.println(reduceSumWithMethodReference.get());
		
		// find max value
		int max = list.stream().reduce(0,(a,b)->a>b?a:b);
		System.out.println(max);
	}

}
