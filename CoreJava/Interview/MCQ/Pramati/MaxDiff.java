package com.shyam.learning.test;

public class Test {

	public static void main(String args[]) {

		int arr[] = { 4, 1, 3, 2 };
		int maxDiff = maxDiff2(arr);
		System.out.println(maxDiff);
		maxDiff = maxDiff(arr);
	}

	private static int maxDiff(int[] arr) {

		int maxDiff = arr[1] - arr[0];
		int i, j;
		for (i = 0; i < arr.length; i++) {

			for (j = i + 1; j < arr.length; j++) {
				if (arr[j] - arr[i] > maxDiff) {
					maxDiff = arr[j] - arr[i];
				}
			}
		}

		if (maxDiff == 0)
			return -1;
		else if (maxDiff <= 0)
			return -1;

		return maxDiff;
	}
	
	
	private static int maxDiff2(int[] arr) {

		int max_diff = arr[1] - arr[0];
        int min_element = arr[0];
        int i;
        for (i = 1; i < arr.length; i++) 
        {
            if (arr[i] - min_element > max_diff)
                max_diff = arr[i] - min_element;
            if (arr[i] < min_element)
                min_element = arr[i];
        }
        return max_diff;
	}


}
