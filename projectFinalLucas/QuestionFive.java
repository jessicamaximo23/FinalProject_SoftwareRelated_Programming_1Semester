package projectFinalLucas;

import java.util.Scanner;

public class QuestionFive {

	public static void main(String[] args) {
		// -----------------------------------------------------
		// Assignment Final Project
		// Written by:Jessica Maximo De Souza ID: 2391133
		// Question Five:Logical Flowchar
		//This question I tried to divide the sides per segment because I can only use three variables
		// -----------------------------------------------------
		Scanner kb = new Scanner(System.in);

		int side = 7;

		// Create array for keep the sizes of each segment
		double[] sides = new double[side];

		// User put all the number of the segment
		for (int i = 0; i < side; i++) {
			System.out.println("Lenght of the segment (cm) " + (i + 1) + "?");
			
			// array to keep this sides
			sides[i] = kb.nextDouble();

			// Perimeter = sum all sides
			double sumPerimeter = 0;
			for (double length : sides) {
				sumPerimeter += length;
			}
			System.out.println("Total Perimeter: " + sumPerimeter);
		}
	}
}
