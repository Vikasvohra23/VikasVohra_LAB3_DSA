package com.glearning.dsa.client;
import java.util.Scanner;

import com.glearning.dsalab3.question1.BalancedBrackets;

public class Client {
	
	public static void main(String[] args) {
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		while(flag) {
			System.out.println("Enter the input  or q to quit::");
			String input = sc.next();
			if (input.equals("q")) {
				flag = false;
				continue;
			}
			boolean result = BalancedBrackets.isBalanced(input);
			System.out.println("Input is balanced ? "+ result);
		}
			sc.close();
	}
}

