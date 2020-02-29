package com.shyam.learning.datastructure.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class AllPairs {

	public static void main(String[] args) {

		int[] arr = { 1, 5, 7, -1, 5 };
		int sum = 6;
		System.out.println("Given sum : " + sum);
		getPairsCount3(arr, sum);

	}

	/*
	 * Count pairs with given sum Given an array of integers, and a number ‘sum’,
	 * find the number of pairs of integers in the array whose sum is equal to ‘sum’
	 */
	public static void getPairsCount1(int[] arr, int sum) {

		int count = 0;// Initialize result

		// Consider all possible pairs and check their sums
		for (int i = 0; i < arr.length; i++)
			for (int j = i + 1; j < arr.length; j++)
				if ((arr[i] + arr[j]) == sum) {
					count++;
					System.out.println(arr[i] + "," + arr[j]);
				}

		System.out.printf("Count of pairs is %d", count);
		// Time Complexity : O(n2)
		// Auxiliary Space : O(1)
	}

	public static void getPairsCount2(int[] arr, int sum) {

		Set set = new HashSet();
		for (int value : arr) {
			int target = sum - value;

			// if target number is not in set then add
			if (!set.contains(target)) {
				set.add(value);
			} else {
				System.out.println(value + "," + target);
			}

		}

		// Time Complexity : O(n)
		// Auxiliary Space : O(n) - It can be a problem if array is too large
	}

	public static void getPairsCount3(int[] arr, int sum) {

		Arrays.sort(arr);
		int left = 0;
		int right = arr.length - 1; // Taking two pointers
		while (left < right) {
			int summation = arr[left] + arr[right];
			if (summation == sum) {
				System.out.println(arr[left] + "," + arr[right]);
				left = left + 1;
				right = right -1;
			}
			else if(summation < sum){
				left = left +1;
			}
			else if (summation > sum) {
				right = right -1;
			}
		}
	}

}
