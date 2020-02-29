package com.shyam.learning.datastructure.array;

import java.util.HashMap;
import java.util.Map;

public class MaximumRepeatingNumber {

	public static void main(String[] args) {

		int arr[] = { 12, 23, 12, 4, 4, 4, 4, 4, 23, 23, 34, 5 };
		System.out.println("Maximum repeating number in the arr : " + findMaximumRepeatingNumber1(arr));
		System.out.println("Maximum repeating number in the arr : " + findMaximumRepeatingNumber2(arr));

	}

	// First Approach
	// Run in linear O(n) time, and
	// Require O(n) space
	private static int findMaximumRepeatingNumber1(int[] arr) {

		int maximumRepeatingNumber = 0;
		HashMap<Integer, Integer> hm = new HashMap();
		for (int i = 0; i < arr.length; i++) {
			int key = arr[i];
			if (hm.containsKey(key)) {
				int value = hm.get(key);
				hm.put(key, value + 1);
			} else {
				hm.put(key, 1);
			}
		}
		int count = 0;
		int key = 0;
		int value = 0;
		for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {

			value = entry.getValue();
			if (value > count) {
				count = value;
				key = entry.getKey();
			}

		}
		maximumRepeatingNumber = key;
		return maximumRepeatingNumber;
	}

	// Second Approach
	private static int findMaximumRepeatingNumber2(int[] arr) {

		int max = 0;
		int maximumRepeatingNumber = 0;
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 1; j < arr.length; j++) {
				if (arr[i] == arr[j])
					count++;
			}
			if (count >= max) {
				max = count;
				maximumRepeatingNumber = arr[i];
			}
		}
		return maximumRepeatingNumber;
	}

}
