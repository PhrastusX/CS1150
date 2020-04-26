//Theophrastus Gamboni-Diehl
//Section 3 of CS1150

import java.util.Scanner;

public class GamboniTheoQuiz1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String tacoName = "";
		int tacoPrice = 0;
		
		System.out.println("What kind of Tacos would you like?\n"
				+ "B for Beef\n"
				+ "C for Chicken\n"
				+ "V for Veggie");
		
		
		String tacoTypeString = input.next().toUpperCase();
		char tacoType = tacoTypeString.charAt(0);
		
		
		if (tacoType == 'B' || tacoType == 'C' || tacoType =='V') {
			if (tacoType == 'B') {
				tacoName = "Beef";
			}
			else if (tacoType =='C') {
				tacoName = "Chicken";
			}
			else if (tacoType == 'V') {
				tacoName = "Veggie";
			}
			System.out.printf("You selected a %s taco!\n\n", tacoName);
			
			System.out.println("How many Tacos would you like?\n"
					+ "choose between 1 and 10 please.");
			
			int numberOfTacos = input.nextInt();
			
			
			if (numberOfTacos >=1 && numberOfTacos <=10) {
				if (tacoType == 'B'){
					tacoPrice = 3;
				}
				else if (tacoType =='C') {
					tacoPrice = 4;
				}
				else if (tacoType == 'V') {
					tacoPrice = 2;
				}
				
				System.out.printf("Your %s tacos cost $%d", tacoName, numberOfTacos*tacoPrice);
				
				
			}
			
			else {
				System.out.println("You did not choose a valid number of tacos!!!");
			}
			
			
		}
		else {
			System.out.println("You did not choose a valid taco!!!");
		}
		
				

	}

}
