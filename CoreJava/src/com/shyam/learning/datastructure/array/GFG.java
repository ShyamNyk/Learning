package com.shyam.learning.datastructure.array;

//Java program to find all elements in
//array which have at-least two greater
//elements itself.
class GFG {

	// First Approach
	static void findElements1(int arr[], int n) {
		// Pick elements one by one and count
		// greater elements. If count is more
		// than 2, print that element.
		for (int i = 0; i < n; i++) {
			int count = 0;

			for (int j = 1; j < n; j++)
				if (arr[j] > arr[i])
					count++;

			if (count >= 2)
				System.out.print(arr[i] + " ");
		}
	}
	
	// 2nd Approach
	static void findElements2(int arr[], int n)
	{
	    int first,second;
	    first = second = Integer.MIN_VALUE;
	    
	     
	    for (int i=0; i<n; i++)
	    {
	        // If current element is smaller than first
	        // then update both first and second 
	        if (arr[i] > first)
	        {
	            second = first;
	            first = arr[i];
	        }
	 
	        /* If arr[i] is in between  
	        first and second
	        then update second */
	        else if (arr[i] > second)
	            second = arr[i];
	    }
	 
	    for (int i=0; i<n; i++)
	        if (arr[i] < second)
	            System.out.print(arr[i] + " ") ;
	}

	// Driver code
	public static void main(String args[]) {
		int arr[] = { 2, -6, 3, 5, 1 };
		int n = arr.length;
		findElements1(arr, n);
		System.out.println();
		findElements2(arr, n);

	}
}

