package org.ryry.programming.tasks.recursion;

import static org.junit.Assert.*;

import org.junit.Test;
import org.ryry.programming.tasks.recursion.BinaryTreeHeightFinder.Tree;

public class BinaryTreeHeightFinderTests {

	@Test
	public final void simpleTest() {
		
		Tree root = new Tree();
		Tree left = new Tree();
		Tree right = new Tree();
		
		root.left = left;
		root.right = right;
		
		Tree child1 = new Tree();
		Tree child2 = new Tree();
		Tree child3 = new Tree();
		Tree child4 = new Tree();
		
		left.left = child1;
		left.right = child2;
		
		child1.left = child3;
		child1.right = child4;
		
		int height = BinaryTreeHeightFinder.height(root);
		assertEquals(4, height);
	}
}
