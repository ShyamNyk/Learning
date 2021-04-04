package com.shyam.learning.serialization;

import java.io.Serializable;

// If a class implements serializable then all its sub classes will also be serializable.

public class SerilazationWithInheritnace implements Serializable {
	int id;
	String name;

	SerilazationWithInheritnace(int id, String name) {
		this.id = id;
		this.name = name;
	}
}

class Student1 extends SerilazationWithInheritnace {
	String course;
	int fee;

	public Student1(int id, String name, String course, int fee) {
		super(id, name);
		this.course = course;
		this.fee = fee;
	}
}

// Now you can serialize the Student class object that extends the Person class 
// which is Serializable. Parent class properties are inherited to subclasses 
// so if parent class is Serializable, subclass would also be
