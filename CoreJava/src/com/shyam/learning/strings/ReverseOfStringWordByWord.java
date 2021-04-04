package com.shyam.learning.strings;

public class ReverseOfStringWordByWord {
	
	public static void main (String args[]) {
		
		String str = "this is morganstanley interview question";
		String reverseStr1 = reverseOfSentence(str);
		System.out.println(reverseStr1);
	}

	private static String reverseOfSentence(String str) {
		String reversedString= "";
		
		String[] arr = str.split("/s");
		for (int i=arr.length-1;i>=0;i--) {
			reversedString = reverse(arr[i]);
		}
		return reversedString;
	}

	private static String reverse(String string) {
	
		StringBuilder sb = new StringBuilder(string);
		sb.reverse();
		
		return sb.toString();
	}

}
