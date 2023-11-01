package projectFinalLucas;

public class QuestionOne {

	public static void main(String[] args) {
		
		// -----------------------------------------------------
		// Assignment Final Project
		// Written by:Jessica Maximo De Souza ID: 2391133
		// Question One: Time Algorithm
		// I use the reference for one your and I started to calculate for hours, minutes and final seconds
		// -----------------------------------------------------

		// initialize variables
		int secondsFinal = 50391;

		// 1 hour
		int hours = 1;
		// have 60 minutes
		int minutes = 60;
		// and 3600 seconds
		int seconds = 3600;

		// If 1 hour has a 3600 seconds. How many hours will have in 50391 seconds?
		int finalhours = secondsFinal / seconds;

		// the rest of this count = hours -> 9975 * minutes = final minutes
		int finalMinutes = (int) (0.9975 * minutes);

		// the rest of this count = minutes -> 0.85
		// 0.85 * seconds / minutes = finalSeconds
		int finalSeconds = (int) (0.85 * seconds / minutes);

		// print the output
		//The result will be 13hours ,59minutes ,51seconds
		System.out.println( finalhours + "hours" + ", " + finalMinutes + "minutes" + ", " + finalSeconds + "seconds" + ".");

	}

}
