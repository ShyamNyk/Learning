package com.shyam.learning.serialization;

import java.io.Serializable;

// If a class has a reference to another class, all the references must be Serializable otherwise serialization process will not be performed. 
// In such case, NotSerializableException is thrown at runtime.

public class SerializationWithAggregation {
	String addressLine, city, state;

	public SerializationWithAggregation(String addressLine, String city, String state) {
		this.addressLine = addressLine;
		this.city = city;
		this.state = state;
	}
}

// Since Address is not Serializable, you can not serialize the instance of Student3 class
class Student3 implements Serializable {
	private static final long serialVersionUID = 1L;
	int id;
	String name;
	SerializationWithAggregation obj;// HAS-A

	public Student3(int id, String name) {
		this.id = id;
		this.name = name;
	}
}
// Note: All the objects within an object must be Serializable.