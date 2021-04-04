package com.shyam.learning.strings;

/*Declare a character stack S.
Now traverse the expression string exp. 
If the current character is a starting bracket (‘(‘ or ‘{‘ or ‘[‘) then push it to stack.
If the current character is a closing bracket (‘)’ or ‘}’ or ‘]’) then pop from stack 
and if the popped character is the matching starting bracket then fine else brackets are not balanced.
After complete traversal, if there is some starting bracket left in stack then “not balanced”
*/
import java.util.Stack;

public class BalancedParan {

	public static void main(String[] args) {

		String str = "{{[]}}()";
		System.out.println(CheckParentesis(str));
	}

	public static boolean CheckParentesis(String str) {
		if (str.isEmpty())
			return true;

		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < str.length(); i++) {
			char current = str.charAt(i);
			if (current == '{' || current == '(' || current == '[') {
				stack.push(current);
				continue;
			}

			if (current == '}' || current == ')' || current == ']') {
				if (stack.isEmpty())
					return false;

				char last = stack.peek();
				if (current == '}' && last == '{' || current == ')' && last == '(' || current == ']' && last == '[')
					stack.pop();
				else
					return false;
			}

		}	
		// Check Empty Stack - true means all the elements have been poped out and it is balanced
		return stack.isEmpty();
	}
}

//Time Complexity: O(n) 
//Auxiliary Space: O(n) for stack. 
