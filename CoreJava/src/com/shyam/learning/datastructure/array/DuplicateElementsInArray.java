package com.shyam.learning.datastructure.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateElementsInArray {

	public static void main(String args[]) {

		int arr[] = { 10, 70, 30, 90, 20, 20, 30, 40, 70, 50 };// unsorted array

		removeDuplicates1(arr);

		// sort the array first
		Arrays.sort(arr);// sorting array

		int length = arr.length;
		length = removeDuplicates2(arr, length);
		// printing array elements
		for (int i = 0; i < length; i++)
			System.out.print(arr[i] + " ");

	}

	/*
	 * Create an auxiliary array temp[] to store unique elements. Traverse input
	 * array and one by one copy unique elements of arr[] to temp[]. Also keep track
	 * of count of unique elements. Let this count be j. Copy j elements from temp[]
	 * to arr[] and return
	 */
	// Time Complexity : O(n)
	// Auxiliary Space : O(n)
	private static int removeDuplicates2(int[] arr, int n) {

		if (n == 0 || n == 1) {
			return n;
		}
		int[] temp = new int[n];
		int j = 0;
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				temp[j] = arr[i];
				j++;
			}
		}
		temp[j++] = arr[n - 1];
		// Changing original array
		for (int i = 0; i < j; i++) {
			arr[i] = temp[i];
		}
		return j;

	}

	// Time Complexity : O(n)
	// Auxiliary Space : O(n)
	private static int removeDuplicates3(int[] arr, int n) {

		if (n == 0 || n == 1)
			return n;

		// To store index of next unique element
		int j = 0;

		// Doing same as done in Method 1
		// Just maintaining another updated index i.e. j
		for (int i = 0; i < n - 1; i++)
			if (arr[i] != arr[i + 1])
				arr[j++] = arr[i];

		arr[j++] = arr[n - 1];

		return j;

	}

	private static void removeDuplicates1(int[] arr) {

		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		System.out.println(set);

	}

}
