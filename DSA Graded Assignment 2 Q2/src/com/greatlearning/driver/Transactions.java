package com.greatlearning.driver;

import com.greatlearning.service.Node;
import com.greatlearning.service.RightSkewedBST;

public class Transactions {

	public static void main(String[] args) {

		Node root = new Node(50);
		root.left = new Node(30);
		root.right = new Node(60);
		root.left.left = new Node(10);
		root.left.right = new Node(20);
		root.right.left = new Node(55);

		RightSkewedBST skewedbst = new RightSkewedBST();

		Node skewedRoot = skewedbst.rightSkewedBST(root);

		skewedbst.printRightSkewedBST(skewedRoot);

	}

}
