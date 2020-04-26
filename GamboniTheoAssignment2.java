/*
 * Name: Theophrastus Gamboni-Diehl
 * Class: CS1150
 * Section: 3
 * Due February 6, 2020
 * Description: Assignment #2
 * The purpose of this assignment is to make a program that will take user input,
 * compute the wind chill in F and C, and format a table to display the calculation,
 * I will demonstrate knowledge of the Scanner class, using order of operations, and 
 * formatting output.
 */

import java.util.Scanner;

public class GamboniTheoAssignment2 {

	public static void main(String[] args) {
		double tempOneC, tempTwoC, tempOneF, tempTwoF; //declaring temperature variables
		double windSpeedOne, windSpeedTwo; // declaring wind speed variables.
		
		//creates a input object from the scanner class.
		Scanner input = new Scanner(System.in); 
		
		//Getting input for the first location, its temp and wind speed
		System.out.println("Enter First Location"); 
		String locationOne = input.next();
		System.out.println("What is the wind speed at "+ locationOne);
		windSpeedOne = input.nextDouble();
		System.out.println("What is the temperature at " + locationOne);
		tempOneF = input.nextDouble();
		
		//getting input for the second location, temp and wind speed
		System.out.println("Enter Second Location");
		String locationTwo = input.next(); //second location
		System.out.println("What is the wind speed at "+ locationTwo);
		windSpeedTwo = input.nextDouble();
		System.out.println("What is the temperature at "+ locationTwo);
		tempTwoF = input.nextDouble();
		
		//converts F to C and stores it in a new variable
		tempOneC = (tempOneF - 32)*5/9; 
		tempTwoC = (tempTwoF - 32)*5/9;
		
		final double EXPO_CONST = .16; // constant used in wind chill formula 
		
		//35.74 + 0.6215t – 35.75v0.16 + 0.4275tv0.16  
		//calculates wind chill in F
		double windChillOneF = 35.74 + 0.6215*tempOneF - 35.75*Math.pow(windSpeedOne, EXPO_CONST)
		+ .4275*tempOneF * Math.pow(windSpeedOne, EXPO_CONST);
		
		double windChillTwoF = 35.74 + 0.6215*tempTwoF - 35.75*Math.pow(windSpeedTwo, EXPO_CONST)
		+ .4275 * tempTwoF * Math.pow(windSpeedTwo, EXPO_CONST);
		
		//converts my wind chill to C and stores in new variable
		double windChillOneC = (windChillOneF - 32)*5/9; 
		double windChillTwoC = (windChillTwoF - 32)*5/9;
		
		//reiterates list of input values for location one
		System.out.println();
		System.out.println("Location number one: " + locationOne);
		System.out.println(locationOne + " Temperature: " + tempOneF);
		System.out.println(locationOne + " Wind Speed: " + windSpeedOne);
		
		//list of input values for location two
		System.out.println();
		System.out.println("Location number two: " + locationTwo);
		System.out.println(locationTwo + " Temperature: " + tempTwoF);
		System.out.println(locationTwo + " Wind Speed: " + windSpeedTwo);
		
		//header for Wind Chill Calculator
		System.out.println("********************************************************************************************");
		System.out.println("                                     Wind Chill Calculator");
		System.out.println("********************************************************************************************");
		
		//prints out the values for top of table
		System.out.println("Location\tWind Speed\tTemp(F)\t\tWind Chill(F)\tTemp(C)\t\tWind Chill(C)");
		
		//prints the first row of values in the table
		System.out.printf("%s", locationOne);
		System.out.printf("\t%6.2f", windSpeedOne);
		System.out.printf("\t\t%6.2f", tempOneF );
		System.out.printf("\t\t%6.2f", windChillOneF);
		System.out.printf("\t\t%6.2f", tempOneC);
		System.out.printf("\t\t%6.2f",windChillOneC );
		
		//prints second row of values in the table
		System.out.println();
		System.out.printf("%s", locationTwo);
		System.out.printf("\t%6.2f", windSpeedTwo);
		System.out.printf("\t\t%6.2f", tempTwoF );
		System.out.printf("\t\t%6.2f", windChillTwoF);
		System.out.printf("\t\t%6.2f", tempTwoC);
		System.out.printf("\t\t%6.2f",windChillTwoC );
		System.out.println();
		System.out.println("********************************************************************************************");
		
		//prints the differences between the values
		System.out.printf("%s", "Differences");
		System.out.printf("\t%6.2f", Math.abs(windSpeedOne-windSpeedTwo));
		System.out.printf("\t\t%6.2f", Math.abs(tempOneF-tempTwoF) );
		System.out.printf("\t\t%6.2f", Math.abs(windChillOneF-windChillTwoF));
		System.out.printf("\t\t%6.2f", Math.abs(tempOneC-tempTwoC));
		System.out.printf("\t\t%6.2f",Math.abs(windChillOneC-windChillTwoC) );
		
	}//main

}//class
