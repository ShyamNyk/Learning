package com.shyam.learning.java8.streamapi;

import java.util.Arrays;
import java.util.List;

public class SumOfOddEvenNumbers {

	public static void main(String args[]) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		int[] a = list.stream().map(n -> n % 2 == 0 ? new int[] { n, 0 } : new int[] { 0, n })
				.reduce(new int[] { 0, 0 }, (x, y) -> new int[] { x[0] + y[0], x[1] + y[1] });
		System.out.println("even sum = " + a[0]); // -> even sum = 20
		System.out.println("odd sum = " + a[1]); // -> odd sum = 25
	}

}
