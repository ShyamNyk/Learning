package com.shyam.learning.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

class PersistExample {
	public static void main(String args[]) throws Exception {
		Student s1 = new Student("g1","g2","g3");// creating object
		// writing object into file
		FileOutputStream f = new FileOutputStream("f.txt");
		ObjectOutputStream out = new ObjectOutputStream(f);
		out.writeObject(s1);
		out.flush();

		out.close();
		f.close();
		System.out.println("success");
	}
}
