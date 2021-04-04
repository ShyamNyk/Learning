package com.shyam.learning.problemSolving;

import java.util.Arrays;

/*Minimum platforms required to accomodate all the trains
 * 
 * Approach: The idea is to take every interval one by one and find the number of intervals that overlap with it. 
 * 	Keep track of the maximum number of intervals that overlap with an interval. Finally, return the maximum value.
Algorithm: 
Run two nested loops the outer loop from start to end and inner loop from i+1 to end.
For every iteration of outer loop find the count of intervals that intersect with the current interval.
Update the answer with maximum count of overlap in each iteration of outer loop.
Print the answer.
*/
public class PlatformsRequired {

	// Time complexity : O(n2)
	// Space Complexity: O(1)
	// Returns minimum number of platforms reqquired
	public static int findPlatform1(int arr[], int dep[], int n) {

		// plat_needed indicates number of platforms
		// needed at a time
		int plat_needed = 1, result = 1;
		int i = 1, j = 0;

		// run a nested loop to find overlap
		for (i = 0; i < n; i++) {
			// minimum platform
			plat_needed = 1;

			for (j = i + 1; j < n; j++) {
				// check for overlap
				if ((arr[i] >= arr[j] && arr[i] <= dep[j]) || (arr[j] >= arr[i] && arr[j] <= dep[i]))
					plat_needed++;
			}

			// update result
			result = Math.max(result, plat_needed);
		}

		return result;
	}

	// Driver Code
	public static void main(String[] args) {
		int arr[] = { 900, 940, 950, 1100, 1500, 1800 };
		int dep[] = { 910, 1200, 1120, 1130, 1900, 2000 };
		int n = 6;
		System.out.println("Minimum Number of Platforms Required = " + findPlatform1(arr, dep, n));
		double arr1[] = { 9.00, 9.40, 9.50, 11.00, 15.00, 18.00 };
		double dep1[] = { 9.10, 12.00, 11.20, 11.30, 19.00, 20.00 };
		System.out.println("Minimum Number of Platforms Required = " + findPlatform2(arr1, dep1, n));
	}

	// Time complexity : O(nlogn)
	// Space Complexity: O(1)
	private static int findPlatform2(double[] arr1, double[] dep1, int n) {
		// Sort arrival and departure arrays
		Arrays.sort(arr1); //O(nlogn)
		Arrays.sort(dep1);

		// plat_needed indicates number of platforms
		// needed at a time
		int plat_needed = 1, result = 1;
		int i = 1, j = 0;

		// Similar to merge in merge sort to process
		// all events in sorted order
		while (i < n && j < n) {
			// If next event in sorted order is arrival,
			// increment count of platforms needed
			if (arr1[i] <= dep1[j]) {
				plat_needed++;
				i++;
			}

			// Else decrement count of platforms needed
			else if (arr1[i] > dep1[j]) {
				plat_needed--;
				j++;
			}

			// Update result if needed
			if (plat_needed > result)
				result = plat_needed;
		}

		return result;
	}
}
