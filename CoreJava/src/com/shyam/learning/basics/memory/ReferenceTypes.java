package com.shyam.learning.basics.memory;

/*In Java there are four types of references differentiated on the way by which they are garbage collected.
Strong References
Weak References
Soft References
Phantom References*/

public class ReferenceTypes {

	public static void main(String args[]) {

		/*
		 * Strong References: This is the default type/class of Reference Object. Any
		 * object which has an active strong reference are not eligible for garbage
		 * collection. The object is garbage collected only when the variable which was
		 * strongly referenced points to null.
		 */
		// Strong Reference - by default
		Gfg g = new Gfg();
		g = null;
		// Now, object to which 'g' was pointing earlier is
		// eligible for garbage collection.

	}

}

class Gfg {
	// Code..
}
