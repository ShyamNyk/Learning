package com.shyam.learning.basics.filehandling;

import java.io.File;

public class FileWalker {

	public static void main(String[] args) {

		String path = "C:\\1SHYAM\\JAVAWorkspaces\\Learning2\\CoreJava\\Testing";
		walk(path);
		
	}

	public static void walk(String path) {
		File root = new File(path);
		File[] list = root.listFiles();
		for (File f : list) {
			int count = 0;
			if (f.isDirectory()) {
				System.out.println("Dir : " + f.getAbsoluteFile());
				walk(f.getAbsolutePath());
			} else {
				System.out.println("File : " + f.getAbsoluteFile());

			}
		}
	}

}
