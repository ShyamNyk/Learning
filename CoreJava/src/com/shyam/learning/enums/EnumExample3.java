package com.shyam.learning.enums;

// Main method inside Enum

enum EnumExample3 {
	WINTER, SPRING, SUMMER, FALL;

	public static void main(String[] args) {
		Season s = Season.WINTER;
		System.out.println(s);
	}
}