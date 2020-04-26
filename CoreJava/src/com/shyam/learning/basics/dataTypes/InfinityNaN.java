package com.shyam.learning.basics.dataTypes;

public class InfinityNaN {

	public static void main(String[] args) {

		System.out.println(Double.POSITIVE_INFINITY); // Infinity
		System.out.println(Double.POSITIVE_INFINITY * -1); // -Infinity
		System.out.println(Double.NEGATIVE_INFINITY);// -Infinity
		System.out.println();
		System.out.println(Double.POSITIVE_INFINITY * Double.POSITIVE_INFINITY);// Infinity
		System.out.println(Double.POSITIVE_INFINITY % Double.POSITIVE_INFINITY);// NaN
		System.out.println(Double.POSITIVE_INFINITY / Double.POSITIVE_INFINITY);// Nan
		System.out.println();
		System.out.println(Double.POSITIVE_INFINITY - Double.NEGATIVE_INFINITY);// Infinity
		System.out.println(Double.POSITIVE_INFINITY - Double.POSITIVE_INFINITY);// Infinity

		System.out.println();
		System.out.println(2.0 / 0); // Infinity
		System.out.println(-2.0 / 0); // -Infinity
		System.out.println(9.0E234 / 0.1E-234); // Infinity

		// Not a number (NaN)
		System.out.println("===========================Not a Number===========================");
		System.out.println(2.0 % 0); // NaN
		System.out.println(0.0 / 0); // NaN
		System.out.println(Math.sqrt(-1));// NaN

		System.out.print("Check if equal :");
		System.out.println(Float.NaN == Float.NaN);

		System.out.print("Check if UNequal: ");
		System.out.println(Float.NaN != Float.NaN);

		// comparing NaN constant field defined in Double Class
		System.out.print("Check if equal: ");
		System.out.println(Double.NaN == Double.NaN);

		System.out.print("Check if UNequal: ");
		System.out.println(Double.NaN != Double.NaN);

		// More Examples
		double NaN = 2.1 % 0;
		System.out.println((2.1 % 0) == NaN);
		System.out.println(NaN == NaN);

		Double x = new Double(-2.0 / 0.0);
		Double y = new Double(0.0 / 0.0);

		// returns false if this Double value is not a Not-a-Number (NaN)
		System.out.println(y + " = " + y.isNaN());

		// returns true if this Double value is a Not-a-Number (NaN)
		System.out.println(x + " = " + x.isNaN());

	}

}

// The Double and Float types have the POSITIVE_INFINITY constant
// nfinity - Infinity is Not A Number.
