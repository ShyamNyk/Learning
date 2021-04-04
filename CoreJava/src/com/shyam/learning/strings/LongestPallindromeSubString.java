package com.shyam.learning.strings;

public class LongestPallindromeSubString {

	public static void main(String args[]) {

		String str1 = "forgeeksskeegfor";
		String str2 = "I am from malayalam";
		String str3 = "assdf";
		printLongestPallindrome(str1);		
		printLongestPallindrome(str2);
		printLongestPallindrome(str3);
	}

	private static void printLongestPallindrome(String str) {

		int maxLength = 1;
		String longestSubString = "";

		for (int i = 0; i < str.length(); i++) {

			for (int j = i + 1; j <= str.length(); j++) {

				String subString = str.substring(i, j);
				//System.out.println(subString);

				if (checkIfPallindrome(subString)) {
					if (subString.length() > maxLength) {
						maxLength = subString.length();
						longestSubString = str.substring(i, j);
					}
				}

			}

		}
		System.out.println(longestSubString);

	}

	private static boolean checkIfPallindrome(String subString) {

		StringBuilder sbr = new StringBuilder(subString);

		return subString.equalsIgnoreCase(sbr.reverse().toString());

	}

}
