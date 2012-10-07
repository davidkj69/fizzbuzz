package org.ryry.alogrithms.recursion;

import java.util.Scanner;

public class Factorial {
	
	private static final String EXIT = "EXIT";
	
	public static void main (String[] args){
		
		Scanner scan = new Scanner (System.in);
		String s = "";
		
		while (!s.equals(EXIT)) {
			System.out.println("Enter number to calculate: ");
			s = scan.nextLine();
			Integer n = Integer.parseInt(s);
			System.out.println(n + "! = " + factorial(n));
		}
	}

	private static int factorial(int n) {
		
		if (n == 1) {
			return 1;
		} else {
			return (n * (factorial(n-1)));
		}
	}
	
}
