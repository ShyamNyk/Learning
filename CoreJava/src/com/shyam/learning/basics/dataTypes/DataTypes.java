package com.shyam.learning.basics.dataTypes;

// 1 byte = 8 bit

public class DataTypes {

	public static void main(String args[]) {

		// byte is 8 bit value
		byte a = 127; // -128(-2^7) - 127(2^7 -1)
		System.out.println(a);
		a++; // It overflows here
		System.out.println(a); 
		byte b = (byte) 130; //valid, but chances of losing data is there.
		System.out.println(b);
		
		
		// Short is 16 bit
		// -32,768(-2^15) - 32,767(2^15 -1)
		
		// Int data type is a 32-bit
		// - 2,147,483,648(-2^31) - 2,147,483,647(2^31 -1)
		
		// Long data type is a 64-bit
		// -9,223,372,036,854,775,808(-2^63) - 9,223,372,036,854,775,807 (inclusive)(2^63 -1)
		// L and small l can be used altenatively
		long var = 100000L;
		Long l1 = (long) 2147483647; //which is max value of int
		/*
		 * in this case no suffix like L/l is required. By default value 2147483647 is
		 * considered by java compiler is int type. Internal type casting is done by
		 * compiler and int is auto promoted to Long type.
		 */
		System.out.println(l1);
		//Long l2 = (long) 2147483648; //CE: value is treated as int but out of range 
		
		Long l = 2147483648L;// works fine.
		
		// Float data type is a single-precision 32-bit IEEE 754 floating point
		// Default value is 0.0f
		float f1 = 234.5f;
		
		// double data type is a double-precision 64-bit IEEE 754 floating point
		// Default value is 0.0d
		double d1 = 123.4;
				
				
		

	}

}
