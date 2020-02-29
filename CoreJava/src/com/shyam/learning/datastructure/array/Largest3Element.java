package com.shyam.learning.datastructure.array;

public class Largest3Element {

	static void print3largest(int arr[]) {
		int i, first, second, third;

		/* There should be atleast two elements */
		if (arr.length < 3) {
			System.out.print(" Invalid Input ");
			return;
		}

		third = first = second = Integer.MIN_VALUE;
		for (i = 0; i < arr.length; i++) {
			/*
			 * If current element is smaller than first
			 */
			if (arr[i] > first) {
				third = second;
				second = first;
				first = arr[i];
			}

			/*
			 * If arr[i] is in between first and second then update second
			 */
			else if (arr[i] > second) {
				third = second;
				second = arr[i];
			}

			else if (arr[i] > third)
				third = arr[i];
		}

		System.out.println("Three largest elements are " + first + " " + second + " " + third);
	}

	/* Driver program to test above function */
	public static void main(String[] args) {
		int arr[] = { 12, 13, 1, 10, 34, 1 };
		print3largest(arr);
	}

}
