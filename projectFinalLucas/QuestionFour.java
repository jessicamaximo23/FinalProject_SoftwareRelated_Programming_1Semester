package projectFinalLucas;

import java.util.Scanner;

public class QuestionFour {

	public static void main(String[] args) {
		// -----------------------------------------------------
		// Assignment Final Project
		// Written by:Jessica Maximo De Souza ID: 2391133
		// Question Four: Printing Parenthesis
		// I tried to use the same logic as in the previous exercise
		// 1. User to enter the number of parentheses they want to combine.
		// 2. Create a recursive function that will build the combinations.
		// 3  In the recursive function, add an open or closed
		// 4. The function must continue to call itself recursively .
		// 5. Print the results
		// 6. Continue calling the recursive function, adding open and closed parentheses
		// References: https://www.youtube.com/watch?v=s9fokUqJ76A
		// -----------------------------------------------------

		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the number of parentheses they want to combine.");
		int parentheses = kb.nextInt();

		// call the method for combinations parentheses
		// with 4 parameters
		combinations(parentheses, 0, 0, "");
	}

	// Create a recursive function that will build the combinations.
	// In this part I realized that method recursive its better if I use void
		public static void combinations(int parentheses, int openParentheses, int closeParentheses, String name) {

		// I can't add a closed parentheses without an open parentheses.
		// For each parentheses on the right there is a parentheses on the left
		// We can only start with open parentheses
		// So number openParentheses is > closeParentheses
		// But we can only add a closeParentheses if the number is always < than openParanetheses

		// if both are equal, we found a valid combination
		if (parentheses == openParentheses && parentheses == closeParentheses) {
			// show the result
			System.out.print(name + ", ");
		} else {
			// This is a case for stop my recursive function
			// only add open parentheses if open < parentheses
			if (openParentheses < parentheses) {
				// call the method (recursive) and pass the attributes that I want to show
				// Otherwise, the function adds an open parenthesis to the partial combination
				// +1 -> ensure that all possible valid combinations are generated.
				// +1 = is used to indicate that we are moving on to the next combination
				combinations(parentheses, openParentheses + 1, closeParentheses, name + "(");
			}
			// This is a case for stop my recursive function
			// it adds a closed parenthesis if the number of closed parentheses is < open parentheses.
			if (closeParentheses < openParentheses) {
				// call the method (recursive) and pass the attributes that I want to show
				combinations(parentheses, openParentheses, closeParentheses + 1, name + ")");
			}
		}
	}
}
