/*
 * Name: Theophrastus Gamboni-Diehl
 * Class: CS1150
 * Section:3
 * Due: Feb 13, 2020
 * Description: Assignment #3
 * This program demonstrates that I understand If statements and nested ifs.
 * It also reinforces some concepts from earlier assignments such as constants,
 * creating a scanner object, and formatting output using the printf method.
*/
import java.util.Scanner;

public class GamboniTheoAssignment3 {

	public static void main(String[] args) {
		
		final double TAX = 0.0825;//tax constant of 8%
		
		final double BANANA_BERRY, TROPICAL, GREEN_JOLT;//declaring my smoothie vars
		final double ALMOND_BUTTER, LIME_JUICE;//declaring my addin vars
		
		//assigning values to my vars and creating vars that go inside if statements
		BANANA_BERRY = 7.50;
		TROPICAL = 6.75;
		GREEN_JOLT = 5.00;
		ALMOND_BUTTER = 1.50;
		LIME_JUICE = 1.50;
		String addInName = "";
		String smoothieName = "";
		double costOfAddIn = 0;
		double costOfTax = 0;
		double total = 0;
		double costOfSmoothie = 0;
		
		//creates a scanner object from scanner class
		Scanner input = new Scanner(System.in);
		
		//prompts user for the kind of smoothie they would like
		System.out.print("What kind of smoothie would you like to order?\n\n"
				+ "1. Banana Berry\t\t$7.50\n\n"
				+ "2. Tropical\t\t$6.75\n\n"
				+ "3. Green Jolt\t\t$5.00\n\n"
				+ "Would you like selection 1, 2 or 3?");
		int selection = input.nextInt();
		System.out.println();
		
		
		//outside if only runs if 1-3 is selected for a smoothie
		if (selection >= 1 && selection <= 3) {
			System.out.print("Would you like and addon with that?\n\n"
					+ "0. No Add-in\t\t$0.00\n\n"
					+ "1. Almond Butter\t$1.50\n\n"
					+ "2. Lime Juice\t\t$1.50\n\n"
					+ "Would you like selection 0, 1, or 2?");
			//stores input for an addin
			int addIn = input.nextInt();
			System.out.println();
			
			//only runs if a addin between 0 and 2 is created
			if(addIn >= 0 && addIn <= 2) {
				
				//initial if statment for Banana Berry smoothie + addins
				if (selection == 1) {
					smoothieName = "Banana Berry";
					costOfSmoothie = BANANA_BERRY;
					if(addIn == 0) {
						costOfTax = costOfSmoothie * TAX;
						total = costOfSmoothie + costOfTax;			
					}//inside if statement for no addin
					else if (addIn == 1){
						addInName = "Almond Butter";
						costOfAddIn = ALMOND_BUTTER;
						costOfTax = costOfSmoothie * TAX;
						total = costOfSmoothie + costOfAddIn + costOfTax;
					}// inside if for almond butter
					else if (addIn == 2 ) {
						addInName = "Lime Juice";
						costOfAddIn = LIME_JUICE;
						costOfTax = costOfSmoothie * TAX;
						total = costOfSmoothie + costOfAddIn + costOfTax;
					}//inside if for lime juice
				}//inside if for Banana Berry
				
				//next if statement for Tropical smoothie + addins
				else if (selection == 2) {
					smoothieName = "Tropical";
					costOfSmoothie = TROPICAL;
					if(addIn == 0) {
						costOfTax = costOfSmoothie * TAX;
						total = costOfSmoothie + costOfTax;
					}//inside if statement for no addin
					else if (addIn == 1){
						addInName = "Almond Butter";
						costOfAddIn = ALMOND_BUTTER;
						costOfTax = costOfSmoothie * TAX;
						total = costOfSmoothie + costOfAddIn + costOfTax;
					}// inside if for almond butter
					else if (addIn == 2 ) {
						addInName = "Lime Juice";
						costOfAddIn = LIME_JUICE;
						costOfTax = costOfSmoothie * TAX;
						total = costOfSmoothie + costOfAddIn + costOfTax;
					}//inside if for lime juice
				}//inside if for Tropical
				
				//next if statement for Green Jolt smoothie plus addins
				else if (selection == 3) {
					smoothieName = "Green Jolt";
					costOfSmoothie = GREEN_JOLT;
					if(addIn == 0) {
						costOfTax = costOfSmoothie * TAX;
						total = costOfSmoothie + costOfTax;
					}//inside if statement for no addin
					else if (addIn == 1){
						addInName = "Almond Butter";
						costOfAddIn = ALMOND_BUTTER;
						costOfTax = costOfSmoothie * TAX;
						total = costOfSmoothie + costOfAddIn + costOfTax;
					}// inside if for almond butter
					else if (addIn == 2 ) {
						addInName = "Lime Juice";
						costOfAddIn = LIME_JUICE;
						costOfTax = costOfSmoothie * TAX;
						total = costOfSmoothie + costOfAddIn + costOfTax;
					}//inside if for lime juice
				}//inside if for Green Jolt
				
				//formatted receipt for the smoothie without addins selections
				if (costOfAddIn == 0) {
					System.out.println("__________________________");
					System.out.println("         Receipt");
					System.out.println("__________________________");
					System.out.println();
					System.out.print(smoothieName);
					System.out.printf("\t$%4.2f\n\n",costOfSmoothie);
					System.out.println("---------------------------");
					System.out.print("Tax");
					System.out.printf("\t\t$%4.2f\n",costOfTax);
					System.out.println("---------------------------");
					System.out.print("Total");
					System.out.printf("\t\t$%4.2f\n",total);
				}
				else {
					//formatted receipt for smoothie with addins
					System.out.println("__________________________");
					System.out.println("         Receipt");
					System.out.println("__________________________");
					System.out.println();
					System.out.print(smoothieName);
					System.out.printf("\t$%4.2f\n\n",costOfSmoothie);
					System.out.print(addInName);
					System.out.printf("\t$%4.2f\n\n",costOfAddIn);
					System.out.println("---------------------------");
					System.out.print("Tax");
					System.out.printf("\t\t$%4.2f\n",costOfTax);
					System.out.println("---------------------------");
					System.out.print("Total");
					System.out.printf("\t\t$%4.2f\n",total);
				}
				
			}// Second if statement
			else {
				System.out.println("Sorry that was not a valid choice");
			}//else saying not valid choice for add-in
		}// outside if statement
		else {
			System.out.println("Sorry that was not a valid choice");
		}//else saying not valid choice for smoothie

	}//main
}//class

