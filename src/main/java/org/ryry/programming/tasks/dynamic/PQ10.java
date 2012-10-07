package org.ryry.programming.tasks.dynamic;

/**
 * There is an array A[N] of N numbers. You have to compose an array Output[N] such that 
 * Output[i] will be equal to multiplication of all the elements of A[N] except A[i]. 
 * For example Output[0] will be multiplication of A[1] to A[N-1] and Output[1] will be 
 * multiplication of A[0] and from A[2] to A[N-1]. Solve it without division operator and in O(n). 
 * 
 *  No inner loop, so we need to store intermediate values. Question is WHAT intermediate values
 *  are of any use?
 *  
 *  forward[idx] = A[idx+1] * ....A[n-1]
 *  backward[idx] = A[0] * .. A[idx-1]
 *  
 *  o[0] = forward[0];
 *  o[1] = forward[1] * backward[1] 
 *  o[2] = forward[2] * backward[2]
 *
 */
public class PQ10 {

	public static final int[] multiply(int[] a) {
		
		if ((a == null) || a.length < 1)
			return a;
		
		int[] output = new int[a.length];
		int[] forward = new int[a.length];
		int[] backward = new int[a.length];		
		
		for (int idx = 0; idx < a.length; idx++) {
			
			// Initalize value
			forward[idx] = 1;
			backward[idx] = 1;
			
			
		}
		
		
		return null;
	}
}
