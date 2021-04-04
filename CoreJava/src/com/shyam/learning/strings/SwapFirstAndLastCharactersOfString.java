package com.shyam.learning.strings;

public class SwapFirstAndLastCharactersOfString {

	public static void main(String args[]) {
		String str = "GeeksForGeeks";

		// Function Call
		System.out.println(swapFirstAndLast1(str));
		System.out.println(swapFirstAndLast2(str));
	}

	// Time Complexity: O(N)
	// Auxiliary Space: O(N)
	private static String swapFirstAndLast1(String str) {
		// Check if the string has only
		// one character then return
		// the string
		if (str.length() < 2)
			return str;

		// Converting the string into
		// a character array
		char[] ch = str.toCharArray();

		// Swapping first and the last
		// character of a string
		char temp = ch[0];
		ch[0] = ch[ch.length - 1];
		ch[ch.length - 1] = temp;

		// Converting character to
		// string and return
		return String.valueOf(ch);
	}

	// Function that swap first and
	// the last character of a string
	public static String swapFirstAndLast2(String str) {

		// Check if the string has only
		// one character then return
		// the string
		if (str.length() < 2)
			return str;

		// Creating a StringBuilder object
		// with given string
		StringBuilder sb = new StringBuilder(str);

		// Finding the first character
		// of the string
		char first = sb.charAt(0);

		// Set last character at index zero
		sb.setCharAt(0, sb.charAt(sb.length() - 1));

		// Set first character at last index
		sb.setCharAt(sb.length() - 1, first);

		// Converting StringBuilder to
		// String and return
		return sb.toString();
	}
}
