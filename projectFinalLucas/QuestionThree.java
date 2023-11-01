package projectFinalLucas;

import java.util.Scanner;

public class QuestionThree {

	public static void main(String[] args) {

		// -----------------------------------------------------
		// Assignment Final Project
		// Written by:Jessica Maximo De Souza ID: 2391133
		// Question Three: String Permutation
		// I tried to use dynamic programming. Divide complex problems of a simpler subproblems
		// 1. User type the words, convert string to char
		// 2. Calculated the number of permutations = factorial (optional)
		// 3. Create a method with recursion for generate all permutations string.
		// 4. Continue this process until all the string is finish
		// 5. Show the results call the method again
		// References:
		// https://franciscochaves.com.br/blog/fatorial-em-java#:~:text=Vamos%20calcular%20o%20fatorial%20do%20n%C3%BAmero%205%20de,%3D%20fatorial%20%2A%20i%3B%20%7D%20return%20fatorial%3B%20%7D
		// https://www.techiedelight.com/pt/generate-permutations-string-java-recursive-iterative/#:~:text=Gerar%20todas%20as%20permuta%C3%A7%C3%B5es%20de%20uma%20string%20em,caracteres.%20...%202%202.%20Abordagem%20Iterativa%3A%20Usando%20Cole%C3%A7%C3%A3o
		// https://stackoverflow.com/questions/38878671/generating-all-permutation-of-a-character-array
		// -----------------------------------------------------

		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a word: ");

		String words = kb.next();
		// convert the string to a array char
		char[] newChar = words.toCharArray();
		// size of the char
		int length = newChar.length;

		System.out.print("All permutations: ");
		// call the method
		// with the char, first position and last position
		Permutation(newChar, 0, length - 1);
		System.out.println();

		// take the length for the string
		int factorial = words.length();
		// Make the factorial = Multiple each number of the size
		// Possibilities for permutation
		for (int i = 1; i < words.length(); i++) {
			factorial = factorial * i;
		}
		System.out.print("All the possibilities in numbers:" + factorial);

	}
	// Create a recursive function that will build the permutations of a string
	public static void Permutation(char[] charArray, int left, int right) {
		// if both are equal,so we have the valid common string -> show the result
		if (left == right) {
			// show the result
			System.out.print(charArray);

		} else {
			// Other wise, do this:
			// go through inside the word for the beginning(left) until the end(right)
			for (int i = left; i <= right; i++) {
				
				//Swap 1 
				// I used a temporary variable to maintain the value of a variable without losing it
				char temporary = charArray[left];
				charArray[left] = charArray[i];
				charArray[i] = temporary;

				System.out.println();
				// call the method (recursive) and pass the attributes that I declared inside the brackets Method
				// +1 -> indicate that are moving on to the next character in the array while generating permutations
				// to ensure that all possible permutations are generated.
				Permutation(charArray, left + 1, right);

				// swap 2  again for change the rest of the combinations
				temporary = charArray[left];
				charArray[left] = charArray[i];
				charArray[i] = temporary;
			}
		}
	}
}
