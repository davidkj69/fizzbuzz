package org.ryry.alogrithms.graphs;

import java.util.Queue;

public class Bfs {

	public static final void main(String[] args) {
		Bfs b = new Bfs();
		b.breadthFirstNonRecursive();
	}
	
	void breadthFirstNonRecursive(){
	    Queue<Node> queue = new java.util.LinkedList<Node>();
	    Node root = getGraph();
		queue.offer(root);
	    while(!queue.isEmpty()){
	        Node node = queue.poll();
	        visit(node);
	        if (node.left != null)
	            queue.offer(node.left);
	        if (node.right != null)
	            queue.offer(node.right);
	    }
	}

	private void visit(Node node) {
		System.out.println("Visiting Node " + node.id);
	}
	
	private class Node {
		int id;
		Node left;
		Node right;		
		
		Node(int id) {
			this.id = id;
		}
				
	}

	private Node getGraph() {
		Node root = new Node(0);
		root.left = new Node(1);
		root.right = new Node(2);
		root.left.left = new Node(3);
		root.left.right = new Node(4);
		root.right.left = new Node(5);
		root.right.right = new Node(6);
		return root;
	}
}
