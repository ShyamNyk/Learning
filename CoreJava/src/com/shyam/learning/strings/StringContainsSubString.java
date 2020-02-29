package com.shyam.learning.strings;

public class StringContainsSubString {

	public static void main(String[] args) {

		String str = "Hello my world";
		String subStr = "my";
		System.out.println("First String : " + str);
		System.out.println("Sub String : " + subStr);

		if (isSubstring(str, subStr)) {
			System.out.println("Yes, It is a Sub String");
		} else {
			System.out.println("No, It is not a Sub String");
		}

	}

	public static boolean isSubstring(String str, String subStr) {
		boolean status = false;

		// status = str.indexOf(subStr) >= 0;

		// status = str.indexOf(subStr) != 0;

		// status = str.contains(subStr);

		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (count < subStr.length()) {
				if (str.charAt(i) == subStr.charAt(count)) {
					count++;
				} else {
					count = 0;
				}
			}

		}
		if (count == subStr.length()) {
			System.out.println("Sub String");
			status = true;
		}

		return status;

	}
}
