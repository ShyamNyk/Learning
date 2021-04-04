package com.shyam.learning.strings;

import java.util.StringTokenizer;

public class CountNumberOfWordsInString {

	public static void main(String args[]) {

		String str = "   India   Is My Country  ";
		System.out.println(countNumberOfWords(str));

	}

	private static int countNumberOfWords(String str) {
		int count = 0;

		char ch[] = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			ch[i] = str.charAt(i);
			if (((i > 0) && (ch[i] != ' ') && (ch[i - 1] == ' ')) || ((ch[0] != ' ') && (i == 0)))
				count++;
		}
		return count;
	}

	private static int countNumberOfWords2(String str) {

		StringTokenizer strtkn = new StringTokenizer(str);

		return strtkn.countTokens();
	}

}
