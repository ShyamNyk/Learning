package com.shyam.learning.datastructure.array;

// Given two integer arrays sorted in ascending order and an  integer k. 
// Define sum = a + b, where a is an element from the first array and b is an element from the second one. 
// Find the kth smallest sum out of all possible sums.

public class KthSmallestSum {

	public static void main(String args[]) {

		int[] arr1 = { 1, 2, 3, 4, 5, 6, 7 };
		int[] arr2 = { 10, 11, 12, 13, 14, 15 };
		int k = 5;

		System.out.println(Math.min(arr1[k - 1] + arr2[0], arr1[0] + arr2[k - 1]));

	}

}
