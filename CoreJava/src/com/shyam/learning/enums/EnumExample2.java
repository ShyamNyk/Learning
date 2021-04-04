package com.shyam.learning.enums;

 // Enum example outside the class

enum Season {
	WINTER, SPRING, SUMMER, FALL
}

class EnumExample2 {
	public static void main(String[] args) {
		Season s = Season.WINTER;
		System.out.println(s);
	}
}