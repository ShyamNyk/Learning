package com.shyam.learning;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileArrangement {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String line = null;
		List<String> input = new ArrayList<>();
		List<String> output = new ArrayList<>();

		while ((line = br.readLine()) != null) {
			input.add(line);
		}
		int prev = 0;
		for (int i = 0; i < input.size(); i++) {
			String str = input.get(i);
			int starCount = 0;
			int dotCount = 0;
			if (str.length() == 0) {
				prev = 0;
			}
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) == '*') {
					starCount++;
				}
				if (str.charAt(j) == '.') {
					dotCount++;
				}
			}
			StringBuilder sb = new StringBuilder();
			int next = 0;
			for (int p = 0; p < prev; p++) {
				sb.append(".");
				next++;
			}
			for (int x = 0; x < starCount; x++) {
				sb.append("*");
				prev++;
			}
			for (int y = 0; y < dotCount - next; y++) {
				sb.append(".");
			}
			output.add(sb.reverse().toString());
		}

		output.forEach(e -> System.out.println(e));
	}
}
