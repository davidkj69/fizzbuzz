package org.ryry.alogrithms.recursion;

import java.util.LinkedList;
import java.util.List;

public class DepthFirstSearch {

	
	public static List<Node> depthFirstTraversal(Node root) {
		// Create a list of nodes to process, starting with the root node.
		final List<Node> nodes = new LinkedList<Node>();
		nodes.add(root);

		// Recursively add all children of all nodes of root to nodes
		for (Node n : root.getChildren()) {
			nodes.addAll(depthFirstTraversal(n));
		}

		return nodes;
	}
	
	public static final void main(String[] args) {
		
		List<Node> path = depthFirstTraversal(getGraph().getRoot());
		
		for (Node n : path) {
			System.out.println(n.getValue());
		}
	}
	
	private static Graph getGraph() {
		
		Graph g = new Graph();
		for(int i = 1; i < 3; i++) {
			Node n = new Node(1);
			g.getRoot().getChildren().add(n);
			for(int j = 1; j < 5; j++) {
				Node n1 = new Node((10*i) + j);
				n.getChildren().add(n1);
				for(int k = 1; k < 10; k++) {
					n1.getChildren().add(new Node((100*i) + (10*j) + k));
				}
			}
		}
		
		return g;
	}
	
	public static class Node {
		
		private int value;
		private List<Node> children = new LinkedList<Node> ();
		
		public Node() {
			
		}
		
		public Node(int v) {
			value = v;
		}
		
		public int getValue() {
			return value;
		}
		
		public List<Node> getChildren() {
			return children;
		}
	}
	
	public static class Graph {

		private Node root;
		
		public Graph() {
			root = new Node(0);		
		}

		public Node getRoot() {
			return root;
		}

		public void setRoot(Node root) {
			this.root = root;
		}
		
	}
}
