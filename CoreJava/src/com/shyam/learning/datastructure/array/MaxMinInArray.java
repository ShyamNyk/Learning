package com.shyam.learning.datastructure.array;

import java.util.Arrays;
import java.util.Collections;

public class MaxMinInArray {

	static int arr1[] = { 10, 324, 45, 90, 9808 };
	static Integer arr2[] = { 10, 324, 45, 90, 9808 };

	static int largest(int arr[]) {
		// Initialize maximum element
		int max = arr[0];

		// Traverse array elements from second and
		// compare every element with current max
		for (int i = 1; i < arr1.length; i++)
			if (arr[i] > max)
				max = arr[i];

		return max;
	}

	static int smallest(int arr[]) {
		// Initialize maximum element
		int min = arr[0];

		// Traverse array elements from second and
		// compare every element with current max
		for (int i = 1; i < arr1.length; i++)
			if (arr[i] < min)
				min = arr[i];

		return min;
	}

	// Driver method
	public static void main(String[] args) {

		System.out.println("Maximum number in the array is " + largest(arr1));
		System.out.println("Maximum number in the array is " + Collections.max(Arrays.asList(arr2)));
		
		System.out.println("Minimum number in the array is " + smallest(arr1));
		System.out.println("Minimum number in the array is " + Collections.min(Arrays.asList(arr2)));
	}

}
