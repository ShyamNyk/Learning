package com.shyam.learning.strings;

import java.util.Date;

public class TestClass {

	public static void main(String[] args) {
		
		
		ImmutableClass im = ImmutableClass.createNewInstance(100,"test", new Date());
        System.out.println(im);
        tryModification(im.getImmutableField1(),im.getImmutableField2(),im.getMutableField());
        System.out.println(im);

	}
	
	private static void tryModification(Integer immutableField1, String immutableField2, Date mutableField)
    {
        immutableField1 = 10000;
        immutableField2 = "test changed";
        mutableField.setDate(10);
    }

}



//1) Don’t provide “setter” methods — methods that modify fields or objects referred to by fields.

//This principle says that for all mutable properties in your class, do not provide setter methods. Setter methods are meant to change the state of object and this is what we want to prevent here.

//2) Make all fields final and private

//This is another way to increase immutability. Fields declared private will not be accessible outside the class and making them final will ensure the even accidentally you can not change them.

//3) Don’t allow subclasses to override methods

//The simplest way to do this is to declare the class as final. Final classes in java can not be overridden.

//4) Special attention when having mutable instance variables

//Always remember that your instance variables will be either mutable or immutable. Identify them and return new objects with copied content for all mutable objects. Immutable variables can be returned safely without extra effort.

//A more sophisticated approach is to make the constructor private and construct instances in factory methods.
