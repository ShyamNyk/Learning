package com.shyam.learning.java8.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

/*Many times, we need to perform operations where a stream reduces to single resultant 
value, for example, maximum, minimum, sum, product, etc. Reducing is the repeated 
process of combining all elements.
reduce operation applies a binary operator to each element in the stream where the 
first argument to the operator is the return value of the previous application and 
second argument is the current stream element.
*/
//sum(), min(), max(), count() etc are some examples of reduce operations
public class StreamReduce {

	public static void main(String args[]) {

		List<String> words = Arrays.asList("GFG", "Geeks", "for", "GeeksQuiz", "GeeksforGeeks");

		// The lambda expression passed to
		// reduce() method takes two Strings
		// and returns the longer String.
		// The result of the reduce() method is
		// an Optional because the list on which
		// reduce() is called may be empty.
		Optional<String> longestString = words.stream()
				.reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2);

		// Implementation of reduce method to get the longest String
		// Displaying the longest String
		longestString.ifPresent(System.out::println);

		// Implementation of reduce method to get the combined String
		String[] array = { "Geeks", "for", "Geeks" };
		Optional<String> String_combine = Arrays.stream(array).reduce((str1, str2) -> str1 + "-" + str2);

		// Creating list of integers
		List<Integer> array1 = Arrays.asList(-2, 0, 4, 6, 8);
		// Finding sum of all elements
		int sum = array1.stream().reduce(0, (element1, element2) -> element1 + element2);
		// Displaying sum of all elements
		System.out.println("The sum of all elements is " + sum);

		// To get the product of all elements
		// in given range excluding the
		// rightmost element
		int product = IntStream.range(2, 8).reduce((num1, num2) -> num1 * num2).orElse(-1);
		// Displaying the product
		System.out.println("The product is : " + product);

	}
}
