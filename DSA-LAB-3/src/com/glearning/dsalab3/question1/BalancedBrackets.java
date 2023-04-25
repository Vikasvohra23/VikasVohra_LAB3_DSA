package com.glearning.dsalab3.question1;

import java.util.Stack;

public class BalancedBrackets {
	/**
	 * pseudocode - Chose the dataStructure - Stack -due to LIFO - input ({[]}) - Adding the
	 * character to the top of the stack until either of '(' '{' '[' is present which Creates a stack of characters writing a loop to push elements to the stack
	 */


	public static boolean isBalanced(String input) {
		// ({[]})
	    // creating a stack data structure of character
		Stack<Character> stack = new Stack<>();
		for (int index = 0; index < input.length(); index++) {
			// extract the character from the string
			char ch = input.charAt(index);
			// if the char is either ({[, then add the element to the stack
			if (ch == '(' || ch == '{' || ch == '[') {
				stack.push(ch);
			} else if (ch == ')' || ch == '}' || ch == ']') {
				if (stack.isEmpty()) {
					return false;
				}
				// start popping elements from the stack.
				// if there is not matching closing bracket, return false
				char top = stack.pop();
				if ((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')) {
					return false;
				}

			}
		}
		return stack.isEmpty();
	}
}


