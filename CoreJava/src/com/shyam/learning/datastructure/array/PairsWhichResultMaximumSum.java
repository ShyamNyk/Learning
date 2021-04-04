package com.shyam.learning.datastructure.array;

//Java program to count pairs 
//with maximum sum. 
public class PairsWhichResultMaximumSum {

	public static void main(String args[]) {

		int array[] = { 1, 1, 1, 2, 2, 2 };
		int n = array.length;
		System.out.println(sum(array, n));
	}

	// function to find the number of
	// maximum pair sums
	static int sum(int a[], int n) {
		// traverse through all the pairs
		int maxSum = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++)
			for (int j = i + 1; j < n; j++)
				maxSum = Math.max(maxSum, a[i] + a[j]);

		// traverse through all pairs and
		// keep a count of the number of
		// maximum pairs
		int c = 0;
		for (int i = 0; i < n; i++)
			for (int j = i + 1; j < n; j++)
				if (a[i] + a[j] == maxSum)
					c++;
		return c;
	}

}
