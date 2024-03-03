package com.greatlearning.service;

public class RightSkewedBST {

	public Node rightSkewedBST(Node root) {
		if (root == null) {
			return null;
		}

		while (root.left != null) {
			root = rightRotate(root);
		}

		root.right = rightSkewedBST(root.right);

		return root;
	}

	public Node rightRotate(Node root) {
		if (root == null || root.left == null) {
			return root;
		}

		Node rightSubtree = root.left;
		root.left = rightSubtree.right;
		rightSubtree.right = root;

		return rightSubtree;
	}

	public void printRightSkewedBST(Node root) {
		while (root != null) {
			System.out.print(root.value + " ");
			root = root.right;
		}
	}

}
