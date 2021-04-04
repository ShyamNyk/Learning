//Write a program to print all permutations of a given string
package com.shyam.learning.strings;

public class PermutationOfString {

	public static void main(String args[]) {

		String s = "abc"; 
		generatePermutation(s, ""); 

	}

	// Function for generating different permutations of the string
	public static void generatePermutation(String str, String ans) {
		// If string is empty 
        if (str.length() == 0) { 
            System.out.print(ans + " "); 
            return; 
        } 
  
        for (int i = 0; i < str.length(); i++) { 
  
            // ith character of str 
            char ch = str.charAt(i); 
  
            // Rest of the string after excluding  
            // the ith character 
            String ros = str.substring(0, i) +  
                         str.substring(i + 1); 
  
            // Recurvise call 
            generatePermutation(ros, ans + ch); 
        }
	}
}

//Time Complexity: O(n*n!) Note that there are n! permutations and it requires O(n) time to print a a permutation.

//Note : The above solution prints duplicate permutations if there are repeating characters in input string.
