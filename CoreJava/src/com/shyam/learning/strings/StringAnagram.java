package com.shyam.learning.strings;

import java.util.Arrays;

public class StringAnagram {

	public static void main(String args[]) {

		String str1 = "test";
		String str2 = "tewt";
		char strArr1[] = str1.toCharArray();
		char strArr2[] = str2.toCharArray();

		// Function Call
		if (areAnagram1(strArr1, strArr2))
			System.out.println("The two strings are" + " anagram of each other");
		else
			System.out.println("The two strings are not" + " anagram of each other");

		String str3 = "geeksforgeeks";
		String str4 = "forgeeksgeeks";

		// Function call
		if (areAnagram2(str3, str4))
			System.out.print("The two strings are " + "anagram of each other");
		else
			System.out.print("The two strings are not " + "anagram of each other");

	}

	// Time Complexity: O(nLogn)
	static boolean areAnagram1(char[] str1, char[] str2) {
		// Get lenghts of both strings
		int n1 = str1.length;
		int n2 = str2.length;

		// If length of both strings is not same,
		// then they cannot be anagram
		if (n1 != n2)
			return false;

		// Sort both strings
		Arrays.sort(str1);
		Arrays.sort(str2);
		Arrays.fill(str1, 'c');

		// Compare sorted strings
		for (int i = 0; i < n1; i++)
			if (str1[i] != str2[i])
				return false;

		return true;
	}

	// Time Complexity: O(N)
	// Auxiliary Space: O(1)
	static boolean areAnagram2(String str1, String str2) {
		if (str1.length() != str2.length())
			return false;

		int count = 0;

		// Take sum of all characters of
		// first String
		for (int i = 0; i < str1.length(); i++) {
			count = count + str1.charAt(i);
		}

		// Subtract the Value of all the characters
		// of second String
		for (int i = 0; i < str2.length(); i++) {
			count = count - str2.charAt(i);
		}

		// If Count = 0 then they are anagram
		// If count > 0 or count < 0 then
		// they are not anagram
		return (count == 0);
	}

}