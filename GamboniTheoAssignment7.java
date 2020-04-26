/*
 * Name: Theophrastus Gamboni-Diehl
 * Class: CS1150
 * Section:3
 * Due: Mar 21, 2020
 * Description: Assignment #7
 * This program demonstrates that I can use methods, and
 * further sharpens my ability to use for and while loops.  
 * 
*/

import java.util.Scanner;

public class GamboniTheoAssignment7{

	public static void main(String[] args){
		
		//sets my variables for previous passwords, and error statments.
		String previousPass1 = "mydogblue1",previousPass2 = "yetimonster1",
		passwordChange = "";
		int error = 0, numberOfPasses =0;
	
		Scanner input = new Scanner(System.in);
		
		
		//runs while the number of times through are less than 4 and a new
		//password has not been set.
		while (numberOfPasses < 4 && error !=5){
			
			//prints the reason the password was denied
			errorHandle(error);
			
			//gets input from password
			System.out.println("What would you like your password to be?");
		
			passwordChange = input.next();
			
			//increments the number of passes through while loop
			numberOfPasses ++;
			System.out.println();
			
			//sets the lenght for the input
			int length = passwordChange.length();
			
			
			//tests the length
			if (lengthTest(length)){
		
				
				//tests the characters numbers and letters
				if(charTest(passwordChange, length)){
			
					
					//tests that there is only one number
					if(numTest(passwordChange, length)){
						
						//tests to make sure a previous password wasnt used
						if(passTest(passwordChange,previousPass1,previousPass2)){
							error = 5;
						}//passTest
						else{
							error = 4;
						}
					}//numTest
					else{
						error = 3;
					}
				}//charTest
				else {
					error = 2;
				}
			}//lengthTest
			else {
				error = 1;
			}
		
		}//while loop
		
		//if password is valid
		if(error == 5){
			System.out.println("You successfully changed your password!");
		}
		//if maxium tries has been reached
		else {
			errorHandle(error);
			System.out.println("You have met the maximum number of tries goodbye!");
		}
		
		
	}//main
	
	//tests to make sure the input is correct length
	public static boolean lengthTest(int length){
		if (length >= 6 && length <= 12){
			return true;
		}
		else{
			return false;
		}
		
	}
	
	//tests to make sure the correct characters were used
	public static boolean charTest(String password, int length){
		int counter = 0;
		for(int i = 0; i <= length-1; i++){
			char passwordAt = password.toUpperCase().charAt(i);
			if(passwordAt >= 'A' && passwordAt <='Z'||
				passwordAt >= '0' && passwordAt <= '9' ){
				
			counter +=1;
			}//if statement
			
			
		}//for loop
		if (counter == length){
			return true;
		}
		else{
			return false;
		}
	}//charTest
	
	//test to make sure there is only one number
	public static boolean numTest(String password, int length){
		int counter = 0;
		for (int i = 0; i <= length-1; i++){
			char passwordAt = password.charAt(i);
			if (passwordAt >='0' && passwordAt <= '9'){
			
				counter ++;
			}
		}
		if (counter == 1){
			return true;
		}
		else{
			return false;
		}
	}//numTest
	
	//tests that the entered password has not been used before.
	public static boolean passTest (String password, String previousPass,
	String previousPass2){
		if (password.equals(previousPass) || password.equals(previousPass2)){
			return false;
		}
		else{
			return true;
		}
	 
	 }//passTest
	 
	//prints out the proper error code if the password was regected
	 public static void errorHandle(int error){
	 	if (error == 1){
	 		System.out.println("Your Password needs to be within 6 and 12 characters.\n");
	 	}
	 	else if (error == 2){
	 		System.out.println("Your Password can only have letters and numbers.\n");
	 	}
	 	else if (error == 3){
	 		System.out.println("Your Password needs only one number.\n");
	 	}
	 	else if (error == 4){
	 		System.out.println("Your password cannot match your last two passwords.\n");
	 	}
	
	 	
	 
	 }//errorHandle
	
	
	
}//class