package com.shyam.learning.strings;

public class ReverseOfString {

	public static void main(String args[]) {

		String str = "geekforgeeks";
		System.out.println("Reverse of String:method1- " + reverse1(str));
		System.out.println("Reverse of String:method2- " + reverse2(str));

	}

	public static String reverse1(String str) {
		String reversedString = "";

		char arr[] = str.toCharArray();
		for (int i = arr.length - 1; i >= 0; i--) {
			reversedString = reversedString + arr[i];
			reversedString = reversedString + String.valueOf(arr[i]);
		}
		return reversedString;
	}

	public static StringBuilder reverse2(String str) {

		StringBuilder sbr = new StringBuilder(str);
		sbr.reverse();

		return sbr;
	}

}
