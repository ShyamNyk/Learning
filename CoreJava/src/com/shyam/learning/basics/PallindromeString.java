package com.shyam.learning.basics;

public class PallindromeString {

	public static void main(String[] args) {

		String str = "aba";
		String reverse = reverseString1(str);
		// String reverse = reverseString2(str);
		// String reverse = reverseString3(str);

		if (str.equals(reverse)) {
			System.out.println("String is Pallindrome");
		}

		else {
			System.out.println("String is not Pallindrome");
		}

	}

	public static String reverseString1(String str) {

		String reverse = "";
		char arr[] = str.toCharArray();
		for (int i = arr.length - 1; i >= 0; i--) {
			reverse = reverse + arr[i];
		}
		return reverse;

	}

	public static String reverseString2(String str) {

		String reverse = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		return reverse;

	}

	public static String reverseString3(String str) {

		StringBuilder sbr = new StringBuilder(str);
		return sbr.reverse().toString();

	}

}
