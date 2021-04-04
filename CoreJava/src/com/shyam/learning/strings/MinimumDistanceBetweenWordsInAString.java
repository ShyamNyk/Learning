package com.shyam.learning.strings;

public class MinimumDistanceBetweenWordsInAString {

	public static void main(String[] args) {
		String s = "geeks for geeks contribute practice";
		String w1 = "geeks";
		String w2 = "practice";
		System.out.println(distance1(s, w1, w2));
		System.out.println(distance2(s, w1, w2));
	}

	// Function to calculate the minimum
	// distance between w1 and w2 in s
	static int distance1(String s, String w1, String w2) {

		if (w1.equals(w2))
			return 0;

		// get individual words in a list
		String words[] = s.split(" ");

		// assume total length of the string
		// as minimum distance
		int min_dist = (words.length) + 1;

		// traverse through the entire string
		for (int index = 0; index < words.length; index++) {

			if (words[index].equals(w1)) {
				for (int search = 0; search < words.length; search++) {
					if (words[search].equals(w2)) {
						// the distance between the words is
						// the index of the first word - the
						// current word index
						int curr = Math.abs(index - search) - 1;

						// comparing current distance with
						// the previously assumed distance
						if (curr < min_dist) {
							min_dist = curr;
						}
					}
				}
			}
		}

		// w1 and w2 are same and adjacent
		return min_dist;
	}

	/*
	 * An efficient solution is to find first occurrence of any element, then keep
	 * track of previous element and current element, if they are different and
	 * distance is less than current minimum, update minimum
	 */
	static int distance2(String s, String w1, String w2) {

		if (w1.equals(w2)) {
			return 0;
		}

		// get individual words in a list
		String[] words = s.split(" ");
		int n = words.length;

		// assume total length of the string as
		// minimum distance
		int min_dist = n + 1;

		// Find the first occurrence of any of the two
		// numbers (w1 or w2) and store the index of
		// this occurrence in prev
		int prev = 0, i = 0;
		for (i = 0; i < n; i++) {

			if (words[i].equals(w1) || words[i].equals(w2)) {
				prev = i;
				break;
			}
		}
		// Traverse after the first occurrence
		while (i < n) {
			if (words[i].equals(w1) || words[i].equals(w2)) {

				// If the current element matches with
				// any of the two then check if current
				// element and prev element are different
				// Also check if this value is smaller than
				// minimum distance so far
				if ((!words[prev].equals(words[i])) && (i - prev) < min_dist) {
					min_dist = i - prev - 1;
					prev = i;
				} else {
					prev = i;
				}

			}
			i += 1;
		}
		return min_dist;
	}
}
