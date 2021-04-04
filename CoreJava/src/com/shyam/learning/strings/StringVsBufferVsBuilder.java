//Objects of String are immutable, and objects of StringBuffer and StringBuilder are mutable.
//StringBuffer and StringBuilder are similar, but StringBuilder is faster 
//and preferred over StringBuffer for single threaded program. If thread safety is needed, then StringBuffer is used.

package com.shyam.learning.strings;

public class StringVsBufferVsBuilder {

	public static void concat1(String s1) {
		s1 = s1 + "forgeeks";
	}

	// Concatenates to StringBuilder
	public static void concat2(StringBuilder s2) {
		s2.append("forgeeks");
	}

	// Concatenates to StringBuffer
	public static void concat3(StringBuffer s3) {
		s3.append("forgeeks");
	}

	public static void main(String[] args) {
		String s1 = "Geeks";
		concat1(s1); // s1 is not changed
		System.out.println("String: " + s1);

		StringBuilder s2 = new StringBuilder("Geeks");
		concat2(s2); // s2 is changed
		System.out.println("StringBuilder: " + s2);

		StringBuffer s3 = new StringBuffer("Geeks");
		concat3(s3); // s3 is changed
		System.out.println("StringBuffer: " + s3);
		
		System.out.println();

		// conversion from String object to StringBuffer
		String str = "Geeks";
		StringBuffer sbr = new StringBuffer(str);
		sbr.reverse();
		System.out.println(sbr);
		

		// conversion from String object to StringBuilder
		StringBuilder sbl = new StringBuilder(str);
		sbl.append("ForGeeks");
		System.out.println(sbl);

		// conversion from StringBuffer object to String
		StringBuffer sbr1 = new StringBuffer("Geeks");
		StringBuilder sbdr = new StringBuilder("Hello");
		String str1 = sbr1.toString();
		System.out.println("StringBuffer object to String : ");
		System.out.println(str1);
		// conversion from StringBuilder object to String
		String str2 = sbdr.toString();
		System.out.println("StringBuilder object to String : ");
		System.out.println(str2);

		// changing StringBuffer object sbr
		// but String object(str) doesn't change
		sbr1.append("ForGeeks");
		System.out.println(sbr1);
		System.out.println(str);
	}
}