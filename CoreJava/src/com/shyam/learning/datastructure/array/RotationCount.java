package com.shyam.learning.datastructure.array;

//Find the Rotation Count in Rotated Sorted arra

public class RotationCount {

	public static void main(String args[]) {
		int arr[] = { 8, 9, 10, 1, 2, 3, 4, 5, 6, 7 };
		System.out.println("Number of times array has been rotated : " + countRotation(arr));
	}

	public static int countRotation(int arr[]) {

		int count = 0;

		// Get the mimimum element in the array
		MaxMinInArray obj = new MaxMinInArray();
		int min = obj.smallest(arr);
		int i;
		for (i = 0; i < arr.length; i++) {
			if (arr[i] == min) {
				break;
			}
		}
		count = i;

		return count;

	}
}
