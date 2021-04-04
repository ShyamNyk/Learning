package com.shyam.learning.datastructure.array;
//Given an array arr[] consisting of N positive integers, the task is to print all pairs of array elements whose sum does not exist in the given array

import java.util.HashSet;

public class PairsWhoSumDoesNotExist {

	// Driver Code
	public static void main(String[] args) {
		int[] arr = { 2, 4, 2, 6 };
		int n = arr.length;

		findPair(arr, n);
	}

	// Time Complexity: O(N2)
	// Auxiliary Space: O(N)
	public static void findPair(int[] arr, int n) {
		int i, j;

		// Corner Case
		if (n < 2) {
			System.out.println("-1");
		}

		// Stores the distinct array
		// elements
		HashSet<Integer> hashMap = new HashSet<Integer>();

		for (Integer k : arr) {
			hashMap.add(k);
		}

		// Generate all possible pairs
		for (i = 0; i < n - 1; i++) {

			for (j = i + 1; j < n; j++) {

				// Calculate sum of current pair
				int sum = arr[i] + arr[j];

				// Check if the sum exists in
				// the HashSet or not
				if (!hashMap.contains(sum)) {

					System.out.println("(" + arr[i] + ", " + arr[j] + ")");
				}
			}
		}
	}
}
