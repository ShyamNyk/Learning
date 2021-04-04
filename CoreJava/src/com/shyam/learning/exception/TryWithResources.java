package com.shyam.learning.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// In Java, the try-with-resources statement is a try statement that declares one or more resources. 
// The resource is as an object that must be closed after finishing the program. The try-with-resources 
// statement ensures that each resource is closed at the end of the statement execution
// You can pass any object that implements java.lang.AutoCloseable, 
// which includes all objects which implement java.io.Closeable
// Note - In a try-with-resources statement, catch or finally block executes after closing of the declared resources.

public class TryWithResources {

	public static void main(String args[]) {

		try (Scanner scanner = new Scanner(new File("file.text"))) {
			while (scanner.hasNext()) {
				System.out.println(scanner.nextLine());
			}
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}
	}

}
