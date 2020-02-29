package com.shyam.learning.datastructure.array;

/*Count pairs in an array which have at least one digit common
Input : A[] = { 10, 12, 24 }
Output : 2
Explanation: Two valid pairs are (10, 12) and (12, 24) which have atleast one digit common*/

public class PairsAtleastOneDigitCommon {

	public static void main(String[] args) {
		int arr[] = { 10, 12, 24 };
		System.out.println("Count pairs in an array which have at least one digit common = " + countPairs(arr));

	}

	public static int countPairs(int arr[]) {

		int numberOfPairs = 0;
		int size = arr.length;

		// Iterate over all possible pairs
		for (int i = 0; i < size; i++)
			for (int j = i + 1; j < size; j++)
				if (checkValidPair(arr[i], arr[j]))
					numberOfPairs++;

		return numberOfPairs;

	}

	public static boolean checkValidPair(int num1, int num2) {
		// converting integers to strings
		String s1 = Integer.toString(num1);
		String s2 = Integer.toString(num2);

		// Iterate over the strings and check
		// if a character in first string is also
		// present in second string, return true
		for (int i = 0; i < s1.length(); i++)
			for (int j = 0; j < s2.length(); j++)
				if (s1.charAt(i) == s2.charAt(j)) {

					System.out.println(num1 + "," + num2);
					return true;
				}

		// No common digit found
		return false;
	}

}
