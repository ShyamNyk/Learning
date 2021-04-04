package com.shyam.learning.java8.functionalinterface;

/*Diamond Problem Solution: Java 8 supports default methods where interfaces 
can provide default implementation of methods. And a class can implement two 
or more interfaces. In case both the implemented interfaces contain default 
methods with same method signature, the implementing class should 
explicitly specify which default method is to be used or it should override 
the default method.*/

interface PI1 
{ 
    // default method 
    default void show() 
    { 
        System.out.println("Default PI1"); 
    } 
} 
  
interface PI2 
{ 
    // Default method 
    default void show() 
    { 
        System.out.println("Default PI2"); 
    } 
} 
  

class DemoClass implements PI1, PI2 
{ 
    // Overriding default show method  // else it will give compile time error
    public void show() 
    { 
        // use super keyword to call the show 
        // method of PI1 interface 
        PI1.super.show(); 
  
        // use super keyword to call the show 
        // method of PI2 interface 
        PI2.super.show(); 
    } 
  
    public static void main(String args[]) 
    { 
    	DemoClass d = new DemoClass(); 
        d.show(); 
    } 
} 