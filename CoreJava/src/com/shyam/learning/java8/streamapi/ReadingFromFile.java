package com.shyam.learning.java8.streamapi;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReadingFromFile {

	public static void main(String args[]) {
		System.out.println("Reading data from file");
		Stream<String> lines = null;

		try {
			lines = Files.lines(Paths.get("file.text"));
			lines.forEach(System.out::println);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (lines != null)
				lines.close();
		}

	}

}
