package com.shyam.learning.designpattern.creational.single.breakcode;

public class SingleToneClonableFix implements Cloneable {
	
	public static SingleToneClonableFix instance = new SingleToneClonableFix(); 
	  
	  SingleToneClonableFix()  
	  { 
	    // private constructor 
	  } 
	  
	  @Override
	  protected Object clone() throws CloneNotSupportedException  
	  { 
		 throw new CloneNotSupportedException();
		 // return instance;
	  } 

}
