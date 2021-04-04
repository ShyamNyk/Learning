package com.shyam.learning.designpattern.creational.single.breakcode;

public class SingleToneClonable implements Cloneable {
	
	public static SingleToneClonable instance = new SingleToneClonable(); 
	  
	  SingleToneClonable()  
	  { 
	    // private constructor 
	  } 
	  
	  @Override
	  protected Object clone() throws CloneNotSupportedException  
	  { 
	    return super.clone(); 
	  } 

}
