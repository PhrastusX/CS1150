/*
 * Name: Theophrastus Gamboni-Diehl
 * Class: CS1150
 * Section:3
 * Due: Feb 27, 2020
 * Description: Assignment #5
 * This program demonstrates that I understand If statements and nested ifs.
 * In the program I also demonstrate that I can increment variables.
 * It also shows that I can use a while statement and do simple arithmetic and 
 * print out results in neat tables.
*/

import java.util.Scanner;

public class GamboniTheoAssignment5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		//prompts user for the initial grade and stores it in grade var
		System.out.println("Enter -1 to end input! Input values from 0 to 100.");
		System.out.print("Enter Grade: ");
		
		double grade = input.nextDouble();

		//this if tests to make sure grades were entered before -1
		if (grade != -1) {
			
			//all of my counters that keep track of grades while while loop is running
			int countNumberOfGrades = 0;
			int countA = 0;
			int countB = 0;
			int countC = 0;
			int countD = 0;
			int countF = 0;
			double highestGrade = grade;
			double lowestGrade = grade;
			double totalGrade = 0;
			
			//terminates while loop if -1 is entered.
			while (grade != -1) {
				
				/*this group of if statements keep track of
				the number of grades entered and the number
				of As, Bs, Cs, Ds, and Fs.*/
				if (grade >= 90) {
					countA++;
					countNumberOfGrades++;
					
				}
				else if(grade >= 80) {
					countB++;
					countNumberOfGrades++;
					
				}
				else if (grade >=70) {
					countC++;
					countNumberOfGrades++;
					
				}
				else if (grade>= 60) {
					countD++;
					countNumberOfGrades++;
					
				}
				else {
					countF++;
					countNumberOfGrades++;
					
				}
				
				/*this group of ifs change the highest and 
				lowest grades*/
				if (grade > highestGrade) {
					highestGrade = grade;
				}
				else if (grade < lowestGrade) {
					lowestGrade = grade;
				}
				
				/*totalGrade keeps track of the sum of all grades entered 
				prompts user for the next grade and the loop continues.*/
				totalGrade += grade;
				System.out.print("Enter Grade: ");
				grade = input.nextDouble();
				
			}//while loop
			
			/*This block of code calculates the percents of each grade that
			is entered.*/
			double countDouble = (double)countNumberOfGrades;
			double percentAs = countA/countDouble*100;
			double percentBs = countB/countDouble*100;
			double percentCs = countC/countDouble*100;
			double percentDs = countD/countDouble*100;
			double percentFs = countF/countDouble*100;
			
			//Prints a list of number of exams, the Average, lowest and highest grade
			System.out.printf("\nThe number of exams entered:\t%d\n"
					+ "The Average of the exams was:\t%5.2f\n"
					+ "The highest exam was:\t\t%5.2f\n"
					+ "The lowest exam was:\t\t%5.2f\n\n", 
					countNumberOfGrades,totalGrade/countNumberOfGrades,highestGrade,lowestGrade);
			
			//Prints a list of numbers of As through Fs
			System.out.printf("Number of A's:\t%d\n"
					+ "Number of B's:\t%d\n"
					+ "Number of C's:\t%d\n"
					+ "Number of D's:\t%d\n"
					+ "Number of F's:\t%d\n\n"
					, countA,countB,countC,countD,countF);
			
			//Prints out a list of the percentages of each grade.
			System.out.printf("Percentage of A's:\t%5.2f\n"
					+ "Percentage of B's:\t%5.2f\n"
					+ "Percentage of C's:\t%5.2f\n"
					+ "Percentage of D's:\t%5.2f\n"
					+ "Percentage of F's:\t%5.2f\n"
					,percentAs,percentBs,percentCs,percentDs,percentFs );
			
		}//if checking if grade is -1
		else {
			System.out.println("You didn't input any grades :(");
		}//for the else above
	

	}//main

}//class
