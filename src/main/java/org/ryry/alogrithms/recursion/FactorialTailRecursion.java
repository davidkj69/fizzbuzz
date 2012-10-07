package org.ryry.alogrithms.recursion;

import java.util.Scanner;


/**
 *  Tail recursion is defined as occurring when the recursive call is at the end of the recursive instruction. 
 *  This is not the case with my factorial solution above. It is useful to notice when ones algorithm uses tail 
 *  recursion because in such a case, the algorithm can usually be rewritten to use iteration instead. In fact, 
 *  the compiler will (or at least should) convert the recursive program into an iterative one. This eliminates 
 *  the potential problem of stack overflow.
 *
 * This is not the case with head recursion, or when the function calls itself recursively in different places like 
 * in the Towers of Hanoi solution. Of course, even in these cases we could also remove recursion by using our own 
 * stack and essentially simulating how recursion would work. 
 */
public class FactorialTailRecursion {

	
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

	private static int factorial(int number) {
	    if(number == 0) {
	           return 1;
	        }
	     return factorial_i(number, 1);
	}

	private static int factorial_i(int currentNumber, int sum) {
	    if(currentNumber == 1) {
	        return sum;
	    } else {
	        return factorial_i(currentNumber - 1, sum*currentNumber);
	    }
	}
}
