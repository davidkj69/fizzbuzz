package org.ryry.programming.tasks.recursion;

public class Fibanocci {

	public static int getFibanocci(int n) {
		
		if (n < 0) 
			throw new RuntimeException("Invalid Parameter");
		
		if ( (n == 1) || (n == 2) ) {
			return 1;
		} else {
			return getFibanocci(n-2) + getFibanocci(n-1);
		}
	}
}
