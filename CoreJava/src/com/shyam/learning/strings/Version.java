package com.shyam.learning.strings;

public class Version {

	public static void main(String[] args) {

		String version1 = "1.0.3.9";
		String version2 = "1.0.7";

		if (versionCompare2(version1, version2) < 0)
			System.out.println(version1 + " is smaller");
		else if (versionCompare2(version1, version2) > 0)
			System.out.println(version2 + " is smaller");
		else
			System.out.println("Both version are equal");

	}

	// Traverse through strings and separate numeric part and compare them, if equal
	// then next numeric part is compared and so on until they differ otherwise flag
	// them as equal.
	static int versionCompare1(String v1, String v2) {
		// vnum stores each numeric part of version
		int vnum1 = 0, vnum2 = 0;

		// loop untill both String are processed
		for (int i = 0, j = 0; (i < v1.length() || j < v2.length());) {
			// Storing numeric part of
			// version 1 in vnum1
			while (i < v1.length() && v1.charAt(i) != '.') {
				vnum1 = vnum1 * 10 + (v1.charAt(i) - '0');
				i++;
			}

			// storing numeric part
			// of version 2 in vnum2
			while (j < v2.length() && v2.charAt(j) != '.') {
				vnum2 = vnum2 * 10 + (v2.charAt(j) - '0');
				j++;
			}

			if (vnum1 > vnum2)
				return 1;
			if (vnum2 > vnum1)
				return -1;

			// if equal, reset variables and
			// go for next numeric part
			vnum1 = vnum2 = 0;
			i++;
			j++;
		}
		return 0;
	}

	// easy to udnerstand
	private static int versionCompare2(String v1, String v2) {

		String[] arr1 = v1.split("\\.");
		String[] arr2 = v2.split("\\.");

		int vnum1 = 0, vnum2 = 0;

		for (int i = 0, j = 0; (i < arr1.length || j < arr2.length);) {

			if (i < arr1.length) {
				vnum1 = Integer.parseInt(arr1[i]);
				i++;
			}
			if (j < arr2.length) {
				vnum2 = Integer.parseInt(arr2[j]);
				j++;
			}

			if (vnum1 > vnum2) {
				return 1;
			} else if (vnum1 < vnum2) {
				return -1;
			} else {
				vnum1 = vnum2 = 0;
			}
		}
		return 0;
	}

}

//Time Complexity: O(n), where n is the length of the string.
//Auxiliary space: O(1).
