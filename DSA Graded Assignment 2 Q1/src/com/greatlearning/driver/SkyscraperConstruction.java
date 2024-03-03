package com.greatlearning.driver;

import java.util.Scanner;

import com.greatlearning.service.constructionOrder;

public class SkyscraperConstruction {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the total no of floors in the building");
		int n = scanner.nextInt(); // scanner to input the total number of floors of the building
		int[] floors = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("enter the floor size given on day : " + (i + 1)); // input for each day's floor size
			floors[i] = scanner.nextInt();
		}

		// object created to analyze the floor assembling in the construction
		System.out.println();
		constructionOrder contorder = new constructionOrder(floors, n);
	}
}
