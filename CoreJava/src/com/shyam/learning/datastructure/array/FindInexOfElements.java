package com.shyam.learning.datastructure.array;

import java.util.Vector;

//Find Index of elements which are equal to the sum of all of its succeeding elements

public class FindInexOfElements {

	// Function to find the valid indices
	static void find_idx(int arr[], int n) {

		// Vector to store the indices
		Vector answer = new Vector();

		// Initialise sum with 0
		int sum = 0;

		// Starting from the last element
		for (int i = n - 1; i >= 0; i--) {

			// If sum till now is equal to
			// the current element
			if (sum == arr[i]) {
				answer.add(i);
			}

			// Add current element to the sum
			sum += arr[i];
		}

		if (answer.size() == 0) {
			System.out.println("-1");
			return;
		}

		for (int i = answer.size() - 1; i >= 0; i--)
			System.out.print(answer.get(i) + " ");
	}

	// Driver code
	public static void main(String[] args) {
		int arr[] = { 6,6,3,7,3,4 };
		int n = arr.length;

		find_idx(arr, n);
	}
}