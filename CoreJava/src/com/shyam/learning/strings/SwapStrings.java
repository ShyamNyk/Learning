package com.shyam.learning.strings;

public class SwapStrings {

	public static void main(String[] args) {
		
		String str1 = "abc";
		String str2 = "pqr";
		System.out.println("Original Strings : ");
		System.out.println(str1);
		System.out.println(str2);
		
		// First Approach
		/*str1 = str1+str2;
		str2 = str1.substring(0, str1.length()-str2.length());
		str1 = str1.substring(str2.length(), str1.length());*/
		
		// Second Approach
		/*str1 = str1+" "+str2;
		str2 = str1.split(" ")[0];
		str1 = str1.split(" ")[1];*/
		
		System.out.println("After Swaping : ");
		System.out.println(str1);
		System.out.println(str2);

	}

}
