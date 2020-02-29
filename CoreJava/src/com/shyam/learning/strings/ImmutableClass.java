package com.shyam.learning.strings;

import java.util.Date;

/*
Immutable class is good for caching purpose because you don’t need to worry about the value changes.
Other benefit of immutable class is that it is inherently thread-safe,
so you don’t need to worry about thread safety in case of multi-threaded environment.*/

// Class must be declared as final (So that child classes can’t be created)
// Data members in the class must be declared as final (So that we can’t change the value of it after object creation)
// A parameterized constructor
// Getter method for all the variables in it
// No setters(To not have option to change the value of the instance variable)

public final class ImmutableClass {

	/**
	 * Integer class is immutable as it does not provide any setter to change its
	 * content
	 */
	private final Integer immutableField1;
	/**
	 * String class is immutable as it also does not provide setter to change its
	 * content
	 */
	private final String immutableField2;
	/**
	 * Date class is mutable as it provide setters to change various date/time parts
	 */
	private final Date mutableField;

	// Default private constructor will ensure no unplanned construction of class
	private ImmutableClass(Integer fld1, String fld2, Date date) {
		this.immutableField1 = fld1;
		this.immutableField2 = fld2;
		this.mutableField = new Date(date.getTime());
	}

	// Factory method to store object creation logic in single place
	public static ImmutableClass createNewInstance(Integer fld1, String fld2, Date date) {
		return new ImmutableClass(fld1, fld2, date);
	}

	// Provide no setter methods

	/**
	 * Integer class is immutable so we can return the instance variable as it is
	 */
	public Integer getImmutableField1() {
		return immutableField1;
	}

	/**
	 * String class is also immutable so we can return the instance variable as it
	 * is
	 */
	public String getImmutableField2() {
		return immutableField2;
	}

	/**
	 * Date class is mutable so we need a little care here. We should not return the
	 * reference of original instance variable. Instead a new Date object, with
	 * content copied to it, should be returned.
	 */
	public Date getMutableField() {
		return new Date(mutableField.getTime());
	}

	@Override
	public String toString() {
		return immutableField1 + " - " + immutableField2 + " - " + mutableField;
	}
}
