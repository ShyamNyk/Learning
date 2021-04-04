package com.shyam.learning.java8.streamapi;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.stream.Stream;

// Java Parallel Streams is a feature of Java 8 and higher, meant for utilizing multiple cores of the processor.
// Normally any java code has one stream of processing, where it is executed sequentially
// Whereas by using parallel streams, we can divide the code into multiple streams 
// that are executed in parallel on separate cores and the final result is the 
// combination of the individual outcomes. The order of execution, 
// however, is not under our control.

// There are two ways we can parralle stream
// 1. Using parallel() method on a stream
// 2. Using parallelStream() on a Collection

public class ParallelStreamExample {
	
	public static void main (String args[]) throws IOException {
		
		 // Create a File object  
        File fileName = new File("file.text"); 
          
        // Create a Stream of String type 
        // Using the lines() method to read one line at a time 
        // from the text file 
        Stream<String> text1 = Files.lines(fileName.toPath()); 
          
        // Use StreamObject.parallel() to create parallel streams 
        // Use forEach() to print the lines on the console 
        text1.parallel().forEach(System.out::println); 
          
        // Close the Stream 
        text1.close();
        System.out.println();
        System.out.println("Using Parallel stream");
        System.out.println();
        // Create a List 
        // Using readAllLines() read the lines of the text file 
        List<String> text2 = Files.readAllLines(fileName.toPath()); 
          
        // Using parallelStream() to create parallel streams 
        text2.parallelStream().forEach(System.out::println); 
        
        
	}

}

/*
 * In case of Parallel stream,4 threads are spawned simultaneously and it
 * internally using Fork and Join pool to create and manage threads.Parallel
 * streams create ForkJoinPool instance via static ForkJoinPool.commonPool()
 * method.
 */

// Why Parallel Streams?
// Parallel Streams were introduced to increase the performance of a program, 
// but opting for parallel streams isn’t always the best choice. 
// There are certain instances in which we need the code to be executed in a 
// certain order and in these cases, we better use sequential streams to perform 
// our task at the cost of performance. The performance difference between the two 
// kinds of streams is only of concern for large scale programs or complex projects. 
// For small scale programs, it may not even be noticeable. 
// Basically you should consider using Parallel Streams when the sequential stream behaves poorly.
