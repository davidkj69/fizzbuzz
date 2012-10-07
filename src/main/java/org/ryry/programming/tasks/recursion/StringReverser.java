package org.ryry.programming.tasks.recursion;

/**
 * Write some code to reverse a string. 
 *
 */

public class StringReverser {

	public static String reverse(String s){
		
		if (s == null)
			return null;
		
		if (s.length() == 1) {
			return s;
		}
		else{			 
			return reverse(s.substring(1, s.length())) + s.substring(0,1);  			
		}
	}
	
}
