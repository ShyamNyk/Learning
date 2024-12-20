package com.shyam.learning.datastructure.array;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

//Java program to find whether two elements exist 
//whose sum is equal to sum of rest of the elements. 
public class PairsWhoseSumEqualsSumOfRest {

	public static void main(String args[]) {

		int arr[] = { 2, 11, 5, 1, 4, 7 };
		int n = arr.length;
		if (checkPair(arr, n) == false) {
			System.out.printf("No pair found");
		}
		Map<Integer,Integer> set = new LinkedHashMap<Integer,Integer>();
	}

	// Function to check whether two elements exist
	// whose sum is equal to sum of rest of the elements.
	// Time complexity : O(n)
	static boolean checkPair(int arr[], int n) {
		// Find sum of whole array
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += arr[i];
		}

		// If sum of array is not even than we can not
		// divide it into two part
		if (sum % 2 != 0) {
			return false;
		}

		sum = sum / 2;

		// For each element arr[i], see if there is
		// another element with vaalue sum - arr[i]
		HashSet<Integer> s = new HashSet<Integer>();
		for (int i = 0; i < n; i++) {
			int val = sum - arr[i];

			// If element exist than return the pair
			if (s.contains(val) && val == (int) s.toArray()[s.size() - 1]) {
				System.out.printf("Pair elements are %d and %d\n", arr[i], val);
				return true;
			}
			s.add(arr[i]);
		}
		return false;
	}

}
