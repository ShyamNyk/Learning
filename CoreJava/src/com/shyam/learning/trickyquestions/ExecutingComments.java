package com.shyam.learning.trickyquestions;

/*Till now, we were always taught “Comments do not Execute”.
Let us see today “The comments that execute”
*/

public class ExecutingComments {

	public static void main(String[] args) {
		
		// the line below this gives an output
        // \u000d System.out.println("comment executed");

	}

}

/*The reason for this is that the Java compiler parses the unicode character \u000d 
as a new line and gets transformed into*/
