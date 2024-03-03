package com.greatlearning.service;

import java.util.Stack;

//creating construction order class to determine the floor placings using stack data structure

public class constructionOrder {

	public constructionOrder(int[] floors, int n) {
		// creating a new stack to input the given day floor sizes
		Stack<Integer> stack = new Stack<>();
		int floorSize = n;
		for (int i = 0; i < n; i++) {
			stack.push(floors[i]);
			System.out.print("day " + (i + 1) + ": "); // if the maximum floor size is not reached then print "day x: "
														// else print
			while (!stack.isEmpty() && stack.peek() <= floorSize) {
				int temp = stack.peek();
				if (temp == floorSize) {
					System.out.print(stack.pop() + " "); // if the maximum size of building is reached then print and
															// remove it
					floorSize--;
				} else {
					break;
				}

			}

			System.out.println();
		}
	}

}
