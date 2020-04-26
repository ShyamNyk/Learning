//Immutable objects are by default thread safe, 
//can be shared without synchronization in concurrent environment.

// You can either declare the class final or make the constructor private

package com.shyam.learning.basics.immutability;

public final class ImmutableClassExample1 {

	private final String firstName;
	private final String lastName;
	private final String address;

	public ImmutableClassExample1(String firstName, String lastName, String address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getAddress() {
		return address;
	}

}

/*
 * Above class is immutable as we can't change field values once it created.
 */