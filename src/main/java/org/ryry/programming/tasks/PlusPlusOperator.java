package org.ryry.programming.tasks;

import java.util.Stack;


public class PlusPlusOperator {

	public static int[] plusPlus(int[] a) {
		
		if ((a == null) || (a.length < 1))
			return a;
								
		Stack<Integer> s = createStack(a);
		
		Stack<Integer> inc = new Stack<Integer> ();
		
		int first = s.pop() + 1;
		int carry = (first > 9) ? 1:0;
		inc.push(first%10);
		
		while (!s.isEmpty()) {
			int val = s.pop() + carry;
			carry = (val > 9) ? 1:0;
			inc.push(val%10);
		}
		
		if (carry == 1) {
			inc.push(1);
		}
		
		int[] b = new int[inc.size()];
		for (int i = 0; i < b.length; i++) {
			b[i] = inc.pop();
		}
		
		return b;
	}
	
	private static Stack<Integer> createStack(int[] a) {
		Stack<Integer> s = new Stack<Integer> ();		
		for (int i = 0; i < a.length; i++) {
			s.push(a[i]);
		}
		
		return s;
	}
}
