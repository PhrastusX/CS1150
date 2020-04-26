/*
 * Name: Theophrastus Gamboni-Diehl
 * Class: CS1150
 * Section:3
 * Due: Feb 20, 2020
 * Description: Assignment #4
 * This program demonstrates that I understand If statements and nested ifs.
 * It also shows that I know how to use the Math class and how to manipulate
 * strings and chars.
*/

import java.util.Scanner;

public class GamboniTheoAssignment4 {

	public static void main(String[] args) {
		
		//creates an input object from scanner class
		Scanner input = new Scanner(System.in);
		
		//prints out rules
		System.out.println("Theo's Powerball Game!");
		System.out.println();
		System.out.println("Enter Two letters and one powerball number");
		System.out.println("Match: One Letter to win $20.00\n"
				+ "Match: Powerball to win $4.00\n"
				+ "Match: Two Letters and The Powerball to win Jackpot!");
		
		//prompts user for input
		System.out.println();
		System.out.println("Enter two letters between A and Z.");
		
		//makes whatever is input to uppercase
		String twoLetterInput = input.next().toUpperCase();

		int powerball;//creates a powerball var
		
		//makes letter from the input into characters.
		char letterOne = twoLetterInput.charAt(0);
		char letterTwo = twoLetterInput.charAt(1);
		
		//tests to make sure the input is valid for the 2 characters
		if (twoLetterInput.length() == 2 && letterOne >= 'A' && letterOne <= 'Z'
		&& letterTwo >= 'A' && letterTwo <= 'Z') {
			
			//prompts user to enter a powerball number
			System.out.println();
			System.out.println("Enter a number between 1 and 26.");
			
			powerball = input.nextInt();
			
			//tests to make sure powerball number is valid
			if (powerball >=1 && powerball <=26) {
				
				//creates 2 random uppercase characters
				int letterOneRandom = 65 + (int) (Math.random()* 26);
				char letterOneRandomChar = (char) letterOneRandom;
				
				int letterTwoRandom = 65 + (int) (Math.random()*26);
				char letterTwoRandomChar = (char) letterTwoRandom;
				
				//creates a random powerball number
				int powerballRandom = 1 + (int) (Math.random()*26);
				
				
	
				//prints out tickets
				System.out.printf("Player's Ticket\n%1c%2c%3d\n\n", letterOne, letterTwo
						, powerball);
				System.out.printf("Powerball Ticket\n%1c%2c%3d\n\n",letterOneRandomChar
						,letterTwoRandomChar,powerballRandom);
				
				//if input chars, random chars and powerball are the same win jackpot
				if (powerball == powerballRandom 
						&& (letterTwo == letterTwoRandomChar || letterTwo == letterOneRandomChar)
						&& (letterOne == letterOneRandomChar || letterOne == letterTwoRandomChar)
						) {
					System.out.println("You win THE JACKPOT");
				}
				//if only one character is the same prints win 20.00
				else if (letterOne == letterTwoRandomChar 
						|| letterOne ==letterOneRandomChar
						|| letterTwo == letterTwoRandomChar 
						|| letterTwo == letterOneRandomChar) {
					System.out.println("You win $20.00");
				}
				//if just the powerball wins prints win 4 dollars
				else if (powerball == powerballRandom) {
					System.out.println("You win $4.00");
				}
				//if nothing matches prints did not win
				else {
					System.out.println("You did not win");
				}
				
			}//if for the correct range of numbers
			else {
				System.out.println("You did not input a valid number!!!");
			}
		}//if checking if a correct input for letters
		else {
			System.out.println("You did not input correct letters!!!");
		}
			
			
	}//main

}//class
