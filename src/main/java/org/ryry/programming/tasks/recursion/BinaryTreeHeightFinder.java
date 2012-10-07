package org.ryry.programming.tasks.recursion;

public class BinaryTreeHeightFinder {

	
	public static int height(Tree t) {
	    if (t == null)
	        return 0;
	    else
	        return max(height(t.left), height(t.right)) + 1;
	}
	
	private static final int max(int a, int b) {
		return (a > b) ? a:b;
	}
	
	public static class Tree {
		Tree left;
		Tree right;
		
	}
}
