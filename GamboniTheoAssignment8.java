/*
 * Name: Theophrastus Gamboni-Diehl
 * Class: CS1150
 * Section:3
 * Due: April 9, 2020
 * Description: Assignment #8
 * This program demonstrates that I can use methods, classes
 * and manipulate the data inside arrays using for loops. Introduces
 * classes, index variables, getters and setters. 
 * 
*/
public class GamboniTheoAssignment8 {

	public static void main(String[] args) {
		
		//creates the array for cities and their populations
		String cityNameArray[] = {"Vail","Pueblo","Denver","Colorado Springs",
				"Greeley","Boulder","Fruita"};
		int cityPopulationArray[]= {5500,110000,2790000,659000,105500,107300,13400};
		
		//prints out a list of city names and their populations
		displayCityPop(cityNameArray,cityPopulationArray);
		System.out.println();

		//prints the total population for all cities
		int populationTotal = totalPop(cityPopulationArray);
		System.out.println("The total Population of the cities is: "+populationTotal);
		
		//prints out average population of the cities
		double averagePopulation = averagePopulation(cityPopulationArray); 
		System.out.printf("The average population of the cities is: %6.2f\n", averagePopulation);
		
		//prints out the city with the largest population
		int indexOfLargestCity = findCityWithLargestPopulation(cityPopulationArray);
		System.out.printf("The city with the largest population is %s at %d\n",
				cityNameArray[indexOfLargestCity], cityPopulationArray[indexOfLargestCity]);
		
		//prints out the cities with above average populations.
		displayCitiesWithAboveAveragePopulation(cityPopulationArray,
				cityNameArray, averagePopulation);
		//creates an array that stores 5 dog objects
		Dog[] dogArray = new Dog[5];
		
		//create 5 dog objects with names and barks
		Dog dog1 = new Dog("Rover", "woof woof");
		Dog dog2 = new Dog("Max", "arf arf arf");
		Dog dog3 = new Dog("Tiny", "yap yap yap");
		Dog dog4 = new Dog("Trooper", "ruff ruff ruff");
		Dog dog5 = new Dog("Magoo", "bow wow bow wow");
		
		//puts the dog objects in array
		dogArray[0] = dog1;
		dogArray[1] = dog2;
		dogArray[2] = dog3;
		dogArray[3] = dog4;
		dogArray[4] = dog5;
		
		//prints out all dog object's names and barks
		makeDogsBark(dogArray);
		
		
	}//main
	
	//Prints out all cities and populations for those cities
	public static void displayCityPop(String city[],int[] population) {
		for (int i = 0; i < population.length; i++) {
			System.out.printf("%-18s\t%d\n", city[i], population[i]);
		}//for
		
	}//displayCityPop
	
	//calculates the total population of all cities
	public static int totalPop(int[] population) {
		int totalPop =0;
		for (int i = 0; i < population.length; i++) {
			totalPop += population[i];
			
		}
		return totalPop;
	}//displayTotalPop
	
	//calculates the average population
	public static double averagePopulation(int[] population) {
		
		//adds up all population
		double popLength = population.length;
		double populationTotal = 0;
		for (int i = 0; i < popLength; i++) {
			populationTotal += population[i];
		}
		//calculates and returns the average population
		double averagePopulation = (populationTotal/popLength);
		return averagePopulation;
	}//averagePopulation
	
	//uses linear search to find the index of the city with the largest population
	public static int findCityWithLargestPopulation(int[] population) {
		int index = 0;
		int largest = population[0];
		for (int i = 0; i < population.length; i++) {
			
			//if the largest population is greater than the population in the array
			//sets it equal to the largest population and saves that index in i
			if (largest < population[i]) {
				largest = population[i];
				index = i;
			}//if
			
		}//for loop
		return index;
		
	}//findCityWithLargestPopulation
	
	//displays the cities with above average population
	public static void displayCitiesWithAboveAveragePopulation(int[] population, 
		       String[] cities, double average) {
		//searches for the index where the population is greater than the average
		for (int i = 0; i< population.length; i++) {
			
			//if that value is larger than the average prints out city name and pop at that index
			if (population[i]>= average) {
				System.out.printf("%s has a population of %d which is above the average of %6.2f\n"
						,cities[i],population[i],average);
			}//if
		}//for
	}//displayCitiesWithAboveAveragePopulation
	
	public static void makeDogsBark(Dog[] dogArray) {
		System.out.println("---------------------------------\n");
		for(int i = 0; i<dogArray.length; i++) {
			System.out.printf("%s barks like this: %s\n",
					dogArray[i].getName(), dogArray[i].getBark());
		}//for
		
	}//makeDogsBark
	
}//GamboniTheoAssignment8


class Dog {							
	private String name;					
	private String bark;					
	
	//constructor for creating dog objects
	public Dog(String name, String bark) {
	   this.name = name;					
	   this.bark = bark;					
	}
	
	//getter for dog objects to return name
	public String getName() {					 
	   return name;						
	}
	//setter for dog objects to change name
	public void setName(String name) {
	   this.name = name;
	}

	public String getBark() {
	   return bark;
	}

	public void setBark(String bark) {
	   this.bark = bark;
	}
} // Dog


