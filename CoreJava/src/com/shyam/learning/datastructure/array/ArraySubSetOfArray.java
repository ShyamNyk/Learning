package com.shyam.learning.datastructure.array;

import java.util.HashMap;

public class ArraySubSetOfArray {

	// Driver code
	public static void main(String args[]) {
		int arr1[] = { 11, 1, 13, 21, 3, 7 };
		int arr2[] = { 11, 3, 7, 1 };

		int m = arr1.length;
		int n = arr2.length;

		if (isSubset1(arr1, arr2, m, n))
			System.out.println("arr2[] is " + "subset of arr1[] ");
		else
			System.out.println("arr2[] is " + "not a subset of arr1[]");

		if (isSubset2(arr1, arr2, m, n))
			System.out.println("arr2[] is " + "subset of arr1[] ");
		else
			System.out.println("arr2[] is " + "not a subset of arr1[]");
		 
		if (isSubset3(arr1, arr2, m, n) != 1)
			System.out.println("arr2[] is " + "subset of arr1[] ");
		else
			System.out.println("arr2[] is " + "not a subset of arr1[]");
	}

	/*
	 * Method-1 Return true if arr2[] is a subset of arr1[] This is the first
	 * approach where timecomplexity=O(n*n)
	 */
	static boolean isSubset1(int arr1[], int arr2[], int m, int n) {
		int i = 0;
		int j = 0;
		for (i = 0; i < n; i++) {
			for (j = 0; j < m; j++)
				if (arr2[i] == arr1[j])
					break;
			/*
			 * If the above inner loop was not broken at all then arr2[i] is not present in
			 * arr1[]
			 */
			if (j == m)
				return false;
		}

		/*
		 * If we reach here then all elements of arr2[] are present in arr1[]
		 */
		return true;
	}

	/*
	 * Method-2 Return true if arr2[] is a subset of arr1[] timecomplexity=O(nlogn)
	 */
	static boolean isSubset2(int arr1[], int arr2[], int m, int n) {
		int i = 0;

		sort(arr1, 0, m - 1);
		for (i = 0; i < n; i++) {
			if (binarySearch(arr1, 0, m - 1, arr2[i]) == -1)
				return false;
		}
		/*
		 * If we reach here then all elements of arr2[] are present in arr1[]
		 */
		return true;
	}

	/*
	 * FOLLOWING FUNCTIONS ARE ONLY FOR SEARCHING AND SORTING PURPOSE
	 */
	/* Standard Binary Search function */
	static int binarySearch(int arr[], int low, int high, int x) {
		if (high >= low) {
			/* low + (high - low)/2; */
			int mid = (low + high) / 2;

			/*
			 * Check if arr[mid] is the first occurrence of x. arr[mid] is first occurrence
			 * if x is one of the following is true: (i) mid == 0 and arr[mid] == x (ii)
			 * arr[mid-1] < x and arr[mid] == x
			 */
			if ((mid == 0 || x > arr[mid - 1]) && (arr[mid] == x))
				return mid;
			else if (x > arr[mid])
				return binarySearch(arr, (mid + 1), high, x);
			else
				return binarySearch(arr, low, (mid - 1), x);
		}
		return -1;
	}

	/*
	 * This function takes last element as pivot, places the pivot element at its
	 * correct position in sorted array, and places all smaller (smaller than pivot)
	 * to left of pivot and all greater elements to right of pivot
	 */
	static int partition(int arr[], int low, int high) {
		int pivot = arr[high];
		int i = (low - 1);

		for (int j = low; j < high; j++) {
			// If current element is smaller than or
			// equal to pivot
			if (arr[j] <= pivot) {
				i++;

				// swap arr[i] and arr[j]
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		// swap arr[i+1] and arr[high] (or pivot)
		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;

		return i + 1;
	}

	/*
	 * The main function that implements QuickSort() arr[] --> Array to be sorted,
	 * low --> Starting index, high --> Ending index
	 */
	static void sort(int arr[], int low, int high) {
		if (low < high) {
			/*
			 * pi is partitioning index, arr[pi] is now at right place
			 */
			int pi = partition(arr, low, high);

			// Recursively sort elements before
			// partition and after partition
			sort(arr, low, pi - 1);
			sort(arr, pi + 1, high);
		}
	}

	static int isSubset3(int a[], int b[], int m, int n) {

		// map to store the values of array a[]
		HashMap<Integer, Integer> mp1 = new HashMap<Integer, Integer>();

		for (int i = 0; i < m; i++)
			if (mp1.containsKey(a[i])) {
				mp1.put(a[i], mp1.get(a[i]) + 1);
			} else {
				mp1.put(a[i], 1);
			}

		// flag value
		int f = 0;

		for (int i = 0; i < n; i++) {
			// if b[i] is not present in map
			// then array b[] can not be a
			// subset of array a[]
			if (!mp1.containsKey(b[i])) {
				f = 1;
				break;
			}

			// if if b[i] is present in map
			// decrement by one
			else {
				mp1.put(b[i], mp1.get(b[i]) - 1);

				if (mp1.get(b[i]) == 0)
					mp1.remove(b[i]);
			}
		}

		return f;
	}

}
