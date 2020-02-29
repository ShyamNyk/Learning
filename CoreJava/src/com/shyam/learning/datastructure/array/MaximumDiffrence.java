package com.shyam.learning.datastructure.array;

public class MaximumDiffrence {

	public static void main(String[] args) {
		MaximumDiffrence maxdif = new MaximumDiffrence();
		int arr[] = { 1, 2, 90, 10, 110 };
		System.out.println("Maximum differnce is " + maxdif.maxDiff1(arr, 5));
		System.out.println("Maximum differnce is " + maxdif.maxDiff2(arr, 5));

	}
	
	/*
	 * The function assumes that there are at least two elements in array. The
	 * function returns a negative value if the array is sorted in decreasing order.
	 * Returns 0 if elements are equal
	 */
	int maxDiff1(int arr[], int arr_size) {
		int max_diff = arr[1] - arr[0];
		int i, j;
		for (i = 0; i < arr_size; i++) {
			for (j = i + 1; j < arr_size; j++) {
				if (arr[j] - arr[i] > max_diff)
					max_diff = arr[j] - arr[i];
			}
		}
		return max_diff;
		// Time Complexity : O(n^2)
		// Auxiliary Space : O(1)
	}
	
	
	/*Method 2 (Tricky and Efficient)
	In this method, instead of taking difference of the picked element with every other element, 
	we take the difference with the minimum element found so far. So we need to keep track of 2 things:
	1) Maximum difference found so far (max_diff).
	2) Minimum number visited so far (min_element).*/
	
	int maxDiff2(int arr[], int arr_size) 
    {
        int max_diff = arr[1] - arr[0];
        int min_element = arr[0];
        int i;
        for (i = 1; i < arr_size; i++) 
        {
            if (arr[i] - min_element > max_diff)
                max_diff = arr[i] - min_element;
            if (arr[i] < min_element)
                min_element = arr[i];
        }
        return max_diff;
        // Time Complexity : O(n)
        // Auxiliary Space : O(1)
    }

}
