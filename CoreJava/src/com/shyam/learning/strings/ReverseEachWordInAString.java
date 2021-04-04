package com.shyam.learning.strings;

import java.util.StringTokenizer;

public class ReverseEachWordInAString {

	public static void main(String args[]) {

		String str = "Hai I am SAP"; // Output - iaH I ma PAS

		System.out.println(reverseOfString(str));
	}

	private static String reverseOfString(String str) {

		String words[] = str.split("\\s");
		String reverseWord = "";
		for (String w : words) {
			StringBuilder sb = new StringBuilder(w);
			sb.reverse();
			reverseWord += sb.toString() + " ";
		}
		return reverseWord.trim();
	}

}
