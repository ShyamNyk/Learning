package com.shyam.learning.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryCatchNormal {

	public static void main(String args[]) {

		Scanner scanner = null;
		try {
			scanner = new Scanner(new File("file.text"));
			while (scanner.hasNext()) {
				System.out.println(scanner.nextLine());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

}
