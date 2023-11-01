package projectFinalLucas;

import java.util.Scanner;

public class QuestionTwo {

	public static void main(String[] args) {
		// -----------------------------------------------------
		// Assignment Final Project
		// Written by:Jessica Maximo De Souza ID: 2391133
		// Question Two:Common Substring Algorithm
		// I tried to use dynamic programming. Divide complex problems of a simpler subproblems
		// and storing my solutions using array:
		// 1 create a while loop for user put as many word that he wants. Needs to be more than 2
		// 2 create array for keep this words
		// 3 create a for loop for  user typing the letter
		// 4 create a loop for find the common letter and a method for find the longest word in common
		// 5 show the results
		// I have a lot of doubts and I use this references below
		// References: https:www.geeksforgeeks.org/longest-common-substring-dp-29/
		// https:www.programcreek.com/2015/04/longest-common-substring-java/
		// -----------------------------------------------------
		Scanner kb = new Scanner(System.in);

		// numberWords;
		int n;

		// Do while for continue asking, if the user put the wrong number (< 2)
		do {
			System.out.println("How many words do you want to compare? ");
			n = kb.nextInt();

			// if number words is less. Show a message
			if (n < 2) {
				System.out.println("Try again, the minimum number should be more or equal to 2");
			} else {
				kb.nextLine();
				// if the number is correct make this:
				// Create array to store the number of the words
				String[] words = new String[n];

				// loop for user typing this words one by one
				for (int i = 0; i < n; i++) {
					// typing the words
					// needs to be inside the loop for how many words the user wants to compare
					System.out.println("Typing the word:" + (i + 1));
					// each quantity is equal to this word that user type
					words[i] = kb.nextLine();
				}
				// string common equal to index 0 of the array
				String common = words[0];

				// loop for go inside the words until the last position
				for (int j = 0; j < words.length; j++) {
					// so string common are equal call the method (to string and words from the loop)
					common = findCommon(common, words[j]);
				}
				System.out.println();

				// if the method common is empty show a message = no common letters
				if (common.isEmpty()) {
					System.out.println("There are no common letters.");
				} else {
					// if not show all the common letters
					System.out.println("The common letters are: " + common);
				}
			}
			// continue asking until the user put the right quantity
		} while (n < 2);

		kb.close();
	}
	// Create a method for find the longest common letters
	// It uses a two-dimensional array to calculate the length of the longest
	// common subsequence between two words.
	// pass only String one and two, no need the string []words
	public static String findCommon(String one, String two) {
		// Calculate the length of the two strings and store the values in array
		// integer = size of the string
		int string1 = one.length();
		int string2 = two.length();

		// array 2D for both integers
		// + 1 accommodate indexes that start at 1 instead of 0.
		int[][] words = new int[string1 + 1][string2 + 1];

		// initialize variables length for the index= maximum and the Minimum
		// maxIndex represents the length of the longest common substring found so far
		int maxIndex = 0;
		// endIndex = is used to track the index of the last character in the longest
		// common substring.
		int endIndex = 0;
		// loop for to go through insides the two strings
		// and compare both strings
		for (int i = 1; i <= string1; i++) {
			for (int j = 1; j <= string2; j++) {

				// Access the character in each positions.
				// -1 -> position
				// If both character are equal ->
				if (one.charAt(i - 1) == two.charAt(j - 1)) {
					// are equal -> the code increment (+1) the value int the words array
					// at previous position= i-1 and j-1
					// This means we are counting the number of matching characters up to this point
					words[i][j] = words[i - 1][j - 1] + 1;

					// if the value words is greater than max Index.
					// If the current value in words[i][j] is greater than maxIndex
					// updates maxIndex to this new value.
					if (words[i][j] > maxIndex) {

						// we up date to the new value
						maxIndex = words[i][j];

						// and the End index for i -1
						// -> this help to tracking the last char in the longest common substring
						endIndex = i - 1;
					}
				}
			}
		}
		// Checker if the length of the longest common substring are equal to 0
		// return empty - > because There is no COMMUM subsequence
		// Function returns empty String
		if (maxIndex == 0) {
			return "";
		}
		// Otherwise, the function returns a substring, that represents the longest
		// common substring (last character in the longest common - length of the longest common )
		// + 1 (because index 0) for to get the full substring
		return one.substring(endIndex - maxIndex + 1, endIndex + 1);
	}
}
