package com.shyam.learning.exception;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

public class TryWithMultipleResources {
	public static void main(String args[]) {

		try (FileOutputStream fileOutputStream = new FileOutputStream("file1.text");
				InputStream input = new FileInputStream("file1.text")) {

			String msg = "Welcome to javaTpoint!";
			byte byteArray[] = msg.getBytes(); // Converting string into byte array
			fileOutputStream.write(byteArray); // Writing data into file
			System.out.println("------------Data written into file--------------");
			System.out.println(msg);

			DataInputStream inst = new DataInputStream(input);
			int data = input.available();

			byte[] byteArray2 = new byte[data];
			inst.read(byteArray2);
			String str = new String(byteArray2);
			System.out.println("------------Data read from file--------------");
			System.out.println(str);
		} catch (Exception exception) {
			System.out.println(exception);
		}
	}
}
