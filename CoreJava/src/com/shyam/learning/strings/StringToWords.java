package com.shyam.learning.strings;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringToWords {

	public static void main(String[] args) {

		String str = " This is a string ";
		System.out.println(Arrays.toString(stringToWords1(str)));
		// stringToWords2(str);

	}

	public static String[] stringToWords1(String str) {

		int count = 0;
		char[] charArr = str.toCharArray();
		int length = charArr.length;

		for (int i = 0; i < length; i++) {
			if (charArr[i] == ' ') {
				if (i != 0 && i != length - 1) { // Ignoring the beginig and end spaces
					count++;
				}
			}
		}

		String word = "\"";
		int k = 0;
		String[] words = new String[count + 1];
		for (int i = 0; i < length; i++) {
			if (charArr[i] == ' ') {
				if (i != 0 && i != length-1) {
					word = word+"\"";
					words[k] = word;
					k++;
					word = "\"";
				}

			} else
				word = word + charArr[i];
		}
		words[k] = word;
		return words;

	}

	public static void stringToWords2(String str) {

		StringTokenizer tokenizer = new StringTokenizer(str);
		while (tokenizer.hasMoreTokens()) {
			String word = tokenizer.nextToken();
			System.out.println(word); // word you are looking in
		}

	}

}
