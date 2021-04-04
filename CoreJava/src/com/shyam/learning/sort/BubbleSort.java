package com.shyam.learning.sort;
//Bubble Sort is the simplest sorting algorithm that works by repeatedly 
//swapping the adjacent elements if they are in wrong order.

//Time Complexity: O(n^2)
//Auxiliary Space: O(1)

public class BubbleSort {

	public static void main(String[] args) {

		BubbleSort ob = new BubbleSort();
		int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
		ob.bubbleSort(arr);
		ob.bubbleSortOptimized(arr);
		System.out.println("Sorted array");
		ob.printArray(arr);
	}
	
	

	private void bubbleSortOptimized(int[] arr) {
		int i, j, temp;
		int n = arr.length;
		boolean swapped;
		for (i = 0; i < n - 1; i++) {
			swapped = false;
			for (j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					// swap arr[j] and arr[j+1]
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}
			// IF no two elements were
			// swapped by inner loop, then break
			if (swapped == false)
				break;
		}
	}

	// The above function always runs O(n^2) time even if the array is sorted.
	// It can be optimized by stopping the algorithm if inner loop didn’t cause any
	// swap using the above method
	void bubbleSort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (arr[j] > arr[j + 1]) {
					// swap arr[j+1] and arr[j]
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
	}

	/* Prints the array */
	void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

}
