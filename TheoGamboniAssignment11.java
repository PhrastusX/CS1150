/*
 * Name: Theophrastus Gamboni-Diehl
 * Class: CS1150
 * Section:3
 * Due: April 23, 2020
 * Description: Assignment #8
 * This program demonstrates the use of Has-a relationship.
 * Also an array of objects are used to store the values of a car.
 * Methods are used to print the array to a file and do the printing
 * of the array.
*/

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class TheoGamboniAssignment11 {

	public static void main(String[] args) throws IOException {
	
	//declare my variables for how long the track is
	//total miles, or amount of loops, and if all cars have gas.
		
	final double MILES_TRAVELED = 1; 
	int totalMilesTraveled = 0;
	boolean allCarsHaveGas = true;
	
	//create an array to hold 5 cars
	Car[] carsArray = new Car[5];
	
	//puts all the info for the cars in.
	setupCars(carsArray);
	
	//writes array to a text file
	writeCarDetailsToFile(carsArray);
	
	
	//prints out the array of cars into a formatted table
	System.out.println("Cars before Simulation");
	printCars(carsArray);
	
	//represents one 
	while(allCarsHaveGas) {
		
		//every time the loop passes this point increments the times around the track
		totalMilesTraveled ++;
		
		
		//cycles through each car in array and updates the fuel based on 
		//one time around the track
		for (int i = 0; i < carsArray.length; i ++) {
			
			
			Car tempCar = carsArray[i];
			
			//updates the fuel based on the miles of the track
			tempCar.updateFuel(MILES_TRAVELED);
		
			
			//checks to see if the last car to go through ran out of gas.
			if (tempCar.getFuelGage().getFuel() == 0) {
				allCarsHaveGas = false;
				
				
			}//if
			
		}//for
		
	}//while
	
	//prints out final list with updated fuel situations in a formatted table
	System.out.println("\nCars After Simulation");
	printCars(carsArray);
	printLoser(totalMilesTraveled, carsArray);
	
	
	}//main
	
	/*Cycles through the array to find the Car with no gas
	 * then prints out the name of the driver and how many iterations it took*/
	public static void printLoser(int totalMiles, Car[] cars) {
		
		for (int i = 0; i < cars.length; i ++) {
			Car tempCar = cars[i];
			
			String tempname = tempCar.getOwner();
			
			if (tempCar.getFuelGage().getFuel() == 0) {
				System.out.printf("\n%s ran out of gas at %d miles\n", tempname, totalMiles);
			}//if
		}//for
	}//print Loser
	
	// Set up the cars for the simulation based on the table 
  	public static void setupCars(Car[] cars) {
  		
  		
  		Car car1 = new Car("Shrek","Toyota Tundra", 15, 6);
  		Car car2 = new Car("Fiona","Audi Q7", 21, 10);
  		Car car3 = new Car("Donkey","Jeep CJ5", 14, 5);
  		Car car4 = new Car("Farquaad","Smart Car", 42, 4);
  		Car car5 = new Car("Dragon","Chevy Suburban", 12, 30);
  		
  		cars[0] = car1;
  		cars[1] = car2;
  		cars[2] = car3;
  		cars[3] = car4;
  		cars[4] = car5;
  	}

  	// Print the details for each car in the array 
    public static void printCars(Car[] cars) {
    	
    	System.out.println("\nOwner\t\t\tType\t\t\t\tMPG\t\tCurrent Gallons");
    	System.out.print("--------------------------------------------");
    	System.out.print("--------------------------------------------\n");
    	for (int i = 0; i < cars.length; i ++) {
    		
    		Car tempCar = cars[i];
    		String tempOwner = tempCar.getOwner();
    		String tempModel = tempCar.getModel();
    		double tempMpg = tempCar.getMpg();
    		double tempFuel = tempCar.getFuelGage().getFuel();
    		
    		System.out.printf("%-10s\t\t%-10s\t\t\t%4.2f\t\t%4.2f\n", tempOwner, tempModel, tempMpg, tempFuel);
    		
    		
    	}//for
  	}//printCars

    	
    	
	// Print the details for each car in the cars array to a file
	public static void writeCarDetailsToFile(Car[] cars) throws IOException {
		
		
		// Setup the file reference variable to refer to the text file.
		// Assignment11.txt is the file that will be created on your hard drive.
		File fileName = new File("Assignment11.txt");
		
		PrintWriter resultsFile = new PrintWriter (fileName);
		resultsFile.println("Car Details");
		
		
		for (int i = 0; i < cars.length; i ++) {
			resultsFile.println(cars[i].getOwner());
			resultsFile.println(cars[i].getModel());
			resultsFile.println(cars[i].getMpg());
			resultsFile.println(cars[i].getFuelGage().getFuel());
			resultsFile.println();
		}
		resultsFile.close();


  	}


}//TheoGamboniAssignment11

class Car{
	private String owner;
	private String model;
	private double mpg;
	private FuelGage fuelGage;
	

	Car(String owner, String model, double mpg, double gallons){
		this.owner = owner;
		this.model = model;
		this.mpg = mpg;
		
		//creates a FuelGage object
		fuelGage = new FuelGage();
		fuelGage.setFuel(gallons);
	    
	}
	
	public String getOwner() {
		return owner;
	}
	public String getModel() {
		return model;
	}
	public double getMpg(){
		return mpg;
	}
	public FuelGage getFuelGage() {
		return fuelGage;
	}
	
	//gallons used based on the length of the track and the mpg of the car
	public void updateFuel(Double miles) {
		double gallonsUsed = miles / mpg;
		fuelGage.lessGallons(gallonsUsed);
	}

	
	
}
class FuelGage{
	private double gallons;
	
	public void setFuel(double gallons) {
		this.gallons = gallons;
		
	}
	public double getFuel() {
		return gallons;
	}
	
	//checks to make sure gallons used isnt greater than the 
	//number of gallons left.  If it is sets gallons = 0
	public void lessGallons(double gallonsUsed) {
		
	
		if (gallonsUsed <= gallons) {
			
		 gallons -= gallonsUsed;
	
		}
		else {
			gallons = 0;
			
		}
	}

	
	
	
}
