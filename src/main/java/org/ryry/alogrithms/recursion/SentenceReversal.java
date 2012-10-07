package org.ryry.alogrithms.recursion;

import java.util.Scanner;

public class SentenceReversal {

	private static final String EXIT = "EXIT";
	
	public static void main (String[] args){
		
		Scanner scan = new Scanner (System.in);
		String s = "";
		
		while (!s.equals(EXIT)) {
			System.out.println("Enter text to reverse: ");
			s = scan.nextLine();
			reverse(s);
		}
	}
		
	public static void reverse(String s){
	
		if (s.length() == 1){
			System.out.print(s);
		}
		else{
			 
			reverse (s.substring(1, s.length()));  
			System.out.print(s.substring(0,1));

		}
	}
}
