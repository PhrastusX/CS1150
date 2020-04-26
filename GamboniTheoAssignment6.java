/*
 * Name: Theophrastus Gamboni-Diehl
 * Class: CS1150
 * Section:3
 * Due: Mar 5, 2020
 * Description: Assignment #6
 * This program demonstrates that I can use while and for loops.
 * It shows that I can nest loops inside other loops, and make effective
 * use of counters and if statments.
*/

import java.util.Scanner;

public class GamboniTheoAssignment6{
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    //prices for the items in the vending machine
    final double CHIPS_PRICE = 1.25, SNICKERS_PRICE = 0.80,
    KINDBAR_PRICE = 0.70;

    //trackers for the total price and the individual selection
    double totalPrice = 0, priceOfSelection = 0;

    //the counters.
    int numberOfSnacks =0, 
    numberOfChips= 0, numberOfSnickers=0, 
    numberOfBars = 0, totalNumberOfSnacks = 0; 
    
    //the selection
    String selection = "", nameOfSelection="";

    /*I use this variable throughout the program to validate the next 
    output the user will see, for example if an incorrect value was added
    for the number of snacks then the menu wouldn't print out again.
    */
    int count = 0; 

    
    while(numberOfSnacks != 999){


      //prints out what is in the snack machine prices and codes.
      while (count == 0){
        System.out.println("************************************************\n");
        System.out.println("                 Snack Machine\n");
        System.out.println("************************************************");
        System.out.printf("Potato Chips\tPotato Chips\tPotato Chips\n"
        +"A1 $%4.2f\tA2 $%4.2f\tA3 $%4.2f\n\n"
        +"Snickers Bar\tSnickers Bar\tSnickers Bar\n"
        +"B1 $%3.2f\tB2 $%3.2f\tB3 $ %3.2f\n\n"
        +"Kind Bar\tKind Bar\tKind Bar\n"
        +"C1 $%3.2f\tC2 $%3.2f\tC3 $%3.2f\n\n", 
        CHIPS_PRICE,CHIPS_PRICE,CHIPS_PRICE,SNICKERS_PRICE,
        SNICKERS_PRICE,SNICKERS_PRICE,KINDBAR_PRICE,
        KINDBAR_PRICE,KINDBAR_PRICE);
        count ++;

        //prompts user for the number of snacks they want
        System.out.println("How many snacks would you like? Enter number between 1 and 3 please!");
        numberOfSnacks = input.nextInt();
      }//while
      
      

      //Tests the number of snacks to make sure its between 1 and 3
      if(numberOfSnacks >=1 && numberOfSnacks <= 3){
        count = 0;
        
        
        //for loop for number of snacks continues to ask user for snacks
        //until the number of snacks has been reached then exits to while statement
        for(int i = 0; i<numberOfSnacks; i++){

          //asks user for the code of the snack they want
          
          if (count == 0){
            System.out.println("Which snacks would you like?");
            selection = input.next().toUpperCase();
          }
          
          else{
            System.out.println("Please enter value A1-A3, B1-B3, C1-C3");
            selection = input.next().toUpperCase();
            count = 0;
          }


          //this group of if statements go throught the possible codes and 
          //updates counters as well as sets vars for the receipt
          if (selection.equals("A1")||selection.equals("A2")||selection.equals("A3")){
            numberOfChips++;
            totalPrice += CHIPS_PRICE;
            nameOfSelection = "Potato Chips";
            priceOfSelection = CHIPS_PRICE;
          }

          else if (selection.equals("B1")||selection.equals("B2")||selection.equals("B3")){
            numberOfSnickers++;
            totalPrice+= SNICKERS_PRICE;
            nameOfSelection = "Snickers Bar";
            priceOfSelection = SNICKERS_PRICE;
          }

          else if (selection.equals("C1")||selection.equals("C2")||selection.equals("C3")){
            numberOfBars++;
            totalPrice+= KINDBAR_PRICE;
            nameOfSelection = "Kind Bar";
            priceOfSelection = KINDBAR_PRICE;
          }

          else{
        	//increment i minus one so it will ask for valid number of snacks
            System.out.println("That is not a correct selection");
            i --; 
            count ++; 
          }

          //if a valid selection was made prints out an individual receipt for that selection
          if((selection.equals("A1")||selection.equals("A2")||selection.equals("A3"))||
          (selection.equals("B1")||selection.equals("B2")||selection.equals("B3"))||
          (selection.equals("C1")||selection.equals("C2")||selection.equals("C3"))){
            
        	  //The receipt for the individual selection
        	  System.out.println("-----------------------------");
        	  System.out.printf("            -%s-  \n", selection);
        	  System.out.println("-----------------------------");
        	  System.out.printf("Snack Item:\t%s\n"
        	  +"Snack Price:\t$%5.2f\n"
            +"-----------------------------\n\n", nameOfSelection,priceOfSelection);
            
            
          }
          
        }//for
        //updates the total number of snacks for each run of the for loop
        totalNumberOfSnacks += numberOfSnacks;
        
        System.out.println("Thank You for your business!\n\n");
        count = 0;
      }//if checking for numbers
      
      //if an error in the number of snacks
      else if (numberOfSnacks != 999) {
        System.out.print("That was an invalid number! Please enter a number between 1 and 3: ");
        numberOfSnacks = input.nextInt();

      }
      
    }//while
    //prints out totals for all loops through vending machine.
    System.out.printf("\n\nTotal Sales:\t\t\t%4.2f\n"
    +"Total number of snacks sold:\t%d\n"
    +"Potato Chips total:\t\t%d\n"
    +"Snickers Bars total:\t\t%d\n"
    +"Kind Bars total:\t\t%d\n"
    ,totalPrice, totalNumberOfSnacks,numberOfChips,numberOfSnickers,numberOfBars);
  }//main

}//class