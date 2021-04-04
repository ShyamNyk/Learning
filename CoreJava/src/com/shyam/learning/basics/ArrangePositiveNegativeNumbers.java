//Move all negative numbers to beginning and positive to end with constant extra space

package com.shyam.learning.basics;

public class ArrangePositiveNegativeNumbers {

	// Driver code
	public static void main(String args[]) {
		int arr1[] = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
		int n = arr1.length;

		rearrange1(arr1, n);
		printArray(arr1, n);
		System.out.println();
		int arr2[] = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
		rearrange2(arr2, arr2.length);
		// printArray(arr2, arr2.length);
	}

	// Linear approach
	// Time Complexity : O(n)
	// Auxiliary space : O(n)
	private static void rearrange2(int[] arr2, int length) {

		int size = arr2.length;
		int[] arrangedArr = new int[size];
		int countFromFirst = 0;
		int countFromLast = size - 1;
		for (int i = 0; i < size; i++) {
			if (arr2[i] > 0) {
				arrangedArr[countFromLast] = arr2[i];
				countFromLast--;
			} else {
				arrangedArr[countFromFirst] = arr2[i];
				countFromFirst++;
			}
		}

		for (int element : arrangedArr) {
			System.out.print(element+" ");
		}

	}

	// A utility function to print an array
	static void printArray(int arr[], int n) {
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}

	// Time Complexity: O(N)
	// Auxiliary Space: O(1)
	static void rearrange1(int arr[], int n) {
		int right = 0, temp;
		for (int left = 0; left < n; left++) {
			if (arr[left] < 0) {
				if (left != right) {
					temp = arr[left];
					arr[left] = arr[right]; // Just swap the numbers
					arr[right] = temp;
				}
				right++;
			}
		}
	}
}
//Time complexity: O(N) 
