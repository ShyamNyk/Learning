package com.shyam.learning.basics.immutability;

class Immutable {
	private final int value;

	public Immutable(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}

public class InheritanceCanAffectImmutability extends Immutable {
	private int realValue;

	public InheritanceCanAffectImmutability(int value) {
		super(value);

		realValue = value;
	}

	public int getValue() {
		return realValue;
	}

	public void setValue(int newValue) {
		realValue = newValue;
	}

	public static void main(String[] arg) {
		InheritanceCanAffectImmutability obj = new InheritanceCanAffectImmutability(4);
		Immutable immObj = (Immutable) obj;
		System.out.println(immObj.getValue());
		obj.setValue(8);
		System.out.println(immObj.getValue());
	}
}

/*
 * Notice that in my InheritanceCanAffectImmutability subclass, I've overridden the behavior of getValue
 * to read a new, mutable field declared in my subclass. As a result, your
 * class, which initially looks immutable, really isn't immutable. I can pass
 * this InheritanceCanAffectImmutability object wherever an Immutable object is expected, which could do
 * Very Bad Things to code assuming the object is truly immutable. Marking the
 * base class final prevents this from happening.
 */
