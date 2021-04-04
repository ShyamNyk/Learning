package com.shyam.learning.strings;

public class MinimumFlipsRequiredToGetTarget {

	public static int minFlips(String target) {

		char curr = '1';
		int count = 0;
		for (int i = 0; i < target.length(); i++) {

			// If curr occurs in the final string
			if (target.charAt(i) == curr) {

				count++;

				// Switch curr to '0' if '1'
				// or vice-versa
				curr = (char) (48 + (curr + 1) % 2);
			}
		}

		return count;
	}

	// Driver Code
	public static void main(String args[]) {

		String S = "11111";
		System.out.println(minFlips(S));
	}
}