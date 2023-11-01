package projectFinalLucas;

import java.util.Scanner;

public class QuestionFive {

	public static void main(String[] args) {
		// -----------------------------------------------------
		// Assignment Final Project
		// Written by:Jessica Maximo De Souza ID: 2391133
		// Question Five:Logical Flowchar
		// In this question I tried to use array and divide the sides by segments
		// but in the end I could only reach the result using 4 variables instead of using 3
		// -----------------------------------------------------
		Scanner kb = new Scanner(System.in);

		//Initialize variable side	
		int side = 7;

		// User put numbers for each side
		for (int i = 0; i < side; i++) {
			System.out.println("Lenght of the segment " + (i + 1) + "?");
			
			// Which side
			double length = kb.nextDouble();

			// Perimeter = sum all sides
			double sumPerimeter = 0;
				sumPerimeter += length;
			
			System.out.println("Total Perimeter: " + sumPerimeter + " cm");
		}
	}
}
