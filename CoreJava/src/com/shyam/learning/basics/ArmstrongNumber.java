package com.shyam.learning.basics;

/*An Armstrong number of three digits is an integer such that the sum of the cubes of 
its digits is equal to the number itself.For example,
371 is an Armstrong number since 3**3+7**3+1**3=371.*/

public class ArmstrongNumber {

	public static void main(String[] args) {

		int num = 372;
		System.out.println("Check if the given number is Armstrong : " + num);
		
		boolean status = ifArmstrong(num);
		if (status == true) {
			System.out.println("It is Armstrong");
		} else {
			System.out.println("It is not Armstrong");
		}
	}

	public static boolean ifArmstrong(int num) {
		boolean status = false;
		int rem = 0;
		int result = 0;
		int tmp = num;
		while (num > 0) {
			rem = num % 10;
			num = num / 10;
			result = result + rem * rem * rem;
		}

		if (tmp == result) {
			return true;
		}

		return status;
	}

}
