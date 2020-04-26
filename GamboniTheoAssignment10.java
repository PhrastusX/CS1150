/*
 * Name: Theophrastus Gamboni-Diehl
 * Class: CS1150
 * Section: 3
 * Due April 16, 2020
 * Description: Assignment #10
 * The purpose of this assignment is to practice putting objects into arrays.
 * Used methods to print out and calculate values in arrays.  Creating objects and 
 * using getter and setters to manipulate the data and do calculations.  Used methods
 * for arrays and used code in main for the Hanger class.
 */
public class GamboniTheoAssignment10 {

	public static void main(String[] args) {
		
		
		//creating the aircraft objects
		Aircraft gulfStream = new Aircraft("Gulf Stream Private Jet", 673);
		Aircraft fighterJet = new Aircraft("F-16 Fighter Jet", 1500);
		Aircraft cessna = new Aircraft("Cessna Sea Plane", 1100);
		Aircraft helicopter = new Aircraft("Bell 407 Helicopter", 160);
		Aircraft boeing = new Aircraft("Boeing 777", 644);
		Aircraft glider = new Aircraft("Glider", 150);
		
		//creating an array that holds aircraft objects
		Aircraft[] planes = new Aircraft[6];
		
		//putting the aircraft objects into 
		planes[0]=gulfStream;
		planes[1]=fighterJet;
		planes[2]=cessna;
		planes[3]=helicopter;
		planes[4]=boeing;
		planes[5]=glider;
		
		//prints a list of aircraft
		printAircraft(planes);
		
		//finds the fastest plane in the array of aircraft
		Aircraft fastestPlane = planes[findFastest(planes)];
		
		//prints the fastest plane
		printFastest(fastestPlane);
		
		//creates a Hanger object based on the lenght of the planes array
		Hanger Hanger = new Hanger(planes.length);
		
		//copies the planes array into the Hanger inHanger array
		for(int i = 0; i < planes.length; i++) {
			Hanger.addAircraft(planes[i]);
		}//for
		
		//prints out the array in Hanger Object
		System.out.println("\n\nAircraft in the Hanger Object");
		System.out.println("----------------------------------------");
		System.out.printf("Aircraft\t\t\tSpeed\n");
		System.out.println("----------------------------------------");
		
		//iterates through Hanger, sets each airplane inhanger to temp values
		//and prints out on a new line
		for (int i = 0; i < Hanger.getNumAircraft(); i++) {
			String tempName = Hanger.getAircraft(i).getAircraftName();
			int tempSpeed = Hanger.getAircraft(i).getAircraftSpeed();
			
			System.out.printf("%-20s\t\t%-10d\n", tempName, tempSpeed );
		}//for loop
		
		//creates variables to be used to calculate the fastest plane
		int topSpeed = 0;
		int index = 0;
		
		
		for (int i = 0; i<Hanger.getNumAircraft(); i++) {
			
			int tempSpeed = Hanger.getAircraft(i).getAircraftSpeed();
			
			//condition statement if the temp speed is higher than the previous value 
			//saves the index of the top speed
			if (tempSpeed> topSpeed) {
				topSpeed = tempSpeed;
				index = i;
			}//if
		}//for
		
		//prints out the fastest aircraft in hanger 
		Aircraft fastest = Hanger.getAircraft(index);
		System.out.println("Aircraft with fastest top speed in hanger that contains an array of aircraft");
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("The Aircraft: " + fastest.getAircraftName());
		System.out.println("The Speed: "+ fastest.getAircraftSpeed());
		
	}//main
	
	//prints out each aircraft in an array of Aircraft objects
	public static void printAircraft (Aircraft [] planes) {
		System.out.println("Aircraft in the planes Array");
		System.out.println("----------------------------------------");
		System.out.printf("Aircraft\t\t\tSpeed\n");
		System.out.println("----------------------------------------");
		
		
		for(int i = 0; i < planes.length; i++) {
			
			//setting a temp variable equal to the name and speed of aircraft at i
			String tempName = planes[i].getAircraftName();
			int tempSpeed = planes[i].getAircraftSpeed();
			
			System.out.printf("%-20s\t\t%-10d\n", tempName, tempSpeed);
		}//for
	}//printAircraft
	
	//iterates through an array of aircraft to find the fastest plane
	public static int findFastest(Aircraft[] planes) {
		
		//set top speed and the starting index to zero
		int topSpeed = 0;
		int index = 0;
		
		
		for (int i = 0; i<planes.length;i++) {
			//gets the speed for the aircraft at i.
			int tempSpeed = planes[i].getAircraftSpeed();
			
			//if the speed at i is greater than top speed saves and returns index.
			if (tempSpeed > topSpeed) {
				topSpeed = tempSpeed;
				index = i;
			}//if
		}//for
		
		return index;
	}//findFastest
	
	//prints out name and speed of fastest aircraft
	public static void printFastest(Aircraft fastestPlane) {

		System.out.println("Aircraft with fastest top speed in the array of aircraft");
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("The Aircraft: " + fastestPlane.getAircraftName());
		System.out.println("The Speed: "+ fastestPlane.getAircraftSpeed());
	}

}//Assignment 10

//defines the Aircraft class
class Aircraft{
	private String name;
	private int speed;
	
	public Aircraft (String name, int speed){
		this.name = name;
		this.speed = speed;
	}//constructor
	
	
	public String getAircraftName() {
		return name;
	}//getter
	
	public int getAircraftSpeed() {
		return speed;
	}//getter
	
	
}//Aircraft
class Hanger{
	
	
	private int numAircraft = 0;
	private Aircraft[] inHanger;
	
	
	public Hanger (int maxNumAircraft) {
		inHanger = new Aircraft[maxNumAircraft];
	}//constructor
	
	public int getNumAircraft(){
		return numAircraft;
	}
	public Aircraft getAircraft(int index) {
		return inHanger[index];
	}
	
	//puts the aircraft input into inhanger array
	public void addAircraft (Aircraft aircraftToAdd) {
		inHanger[numAircraft]=aircraftToAdd;
		numAircraft++;
		
	}
	
	
}
