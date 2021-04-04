package com.shyam.learning.designpattern.creational.single.breakcode;


//Reflection: Reflection can be caused to destroy singleton property of singleton class, as shown in following example:
public class SingleToneReflecable {

	// public instance initialized when loading the class 
    public static SingleToneReflecable instance = new SingleToneReflecable(); 
      
    private SingleToneReflecable()  
    { 
        // private constructor 
    } 
}
