package com.shyam.learning.strings;

public class ReverseSentenceWithoutUsingStringSplit {

	public static void main(String args[]) {

		String str = "how are you"; // output = "you are how"
		String result = ""; // to contain the reverse of the sentence
		result = reverseSentence(str);
		System.out.println(result);
	}

	private static String reverseSentence(String str) {

		String result = "";

		char[] charArr = str.toCharArray();

		for (int i = charArr.length - 1; i >= 0; i--) {
			int k = i;

			// Iterating from the end until i points to space
			while (i >= 0 && charArr[i] != ' ') {
				i--;
			}
			int j = i + 1;
			// copying words into result string
			while (j <= k) {
				result = result + charArr[j];// Concatinate the string using "+" operator
				j++;
			}
			result = result + " ";
		}
		return result;
	}

}
