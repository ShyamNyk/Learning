package com.shyam.learning.designpattern.creational.single.breakcode;

import java.io.Serializable;

//Overcome serialization issue:- To overcome this issue, we have to implement method readResolve() method.

public class SingleToneSerializableFix implements Serializable{

	
	// public instance initialized when loading the class
		public static SingleToneSerializableFix instance = new SingleToneSerializableFix();

		private SingleToneSerializableFix() {
			// private constructor
		}
	
		protected Object readResolve() 
	    { 
	        return instance; 
	    } 
	
}
