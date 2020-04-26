/*
 * Name: Theophrastus Gamboni-Diehl
 * Class: CS1150
 * Section:3
 * Due: April 23, 2020
 * Description: Assignment #12
 * This program demonstrates the use of is-a relationship.
 * Uses file class and scanner class to read a file and put it into an array
 * Override methods in parent class and output the data from the file.
 * 
*/
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TheoGamboniAssignment12 {

	public static void main(String[] args) throws IOException {
		
		//Creates a File object from the file "assignment12.txt"
		File file = new File("assignment12.txt");
		
		//Creates a scanner to read the information in the file
		Scanner inputFile = new Scanner(file);
		
		//
		Animal[] zoo = new Animal[5];
		
		
		//goes through the file and takes out the information for each class
		//and creates the class based on the the first work in each line
		//in the file
		
		for(int i = 0; i < zoo.length; i++) {
			
			//made variables for each word/number in the file
			String type = inputFile.next();
			String name = inputFile.next();
			double weight = inputFile.nextDouble();
			String food = inputFile.next();
			String location = inputFile.next();
			
			
			//determines what kind of animal object to make.
			if (type.equals("Panther")){
				zoo[i] = new Panther(name,weight, food, location);
			}
			else if (type.equals("Penguin")){
				zoo[i] = new Penguin(name,weight, food, location);
			}
			else if (type.equals("Bear")){
				zoo[i] = new Bear(name,weight, food, location);
			}
			else if (type.equals("Wolf")){
				zoo[i] = new Wolf(name,weight, food, location);
			}
			
		}
		
		//iterates through the zoo array and determines
		//what kind of animal is at that location in the array
		//then prints out the conditions of the classes
		for (int i = 0; i < zoo.length; i++) {
			System.out.println();
			if (zoo[i] instanceof Bear) {
				System.out.println("Animal["+i+"] is a Bear");
				
			}
			else if (zoo[i] instanceof Panther) {
				System.out.println("Animal["+i+"] is a Panther");
				
			}
			else if (zoo[i] instanceof Penguin) {
				System.out.println("Animal["+i+"] is a Penguin");
				
			}
			else if (zoo[i] instanceof Wolf) {
				System.out.println("Animal["+i+"] is a Wolf");
				
			}
			//prints out the information from each animal.
			System.out.println(zoo[i].toString());
			zoo[i].eat();
			zoo[i].sleep();
			zoo[i].swim();
		}
	}//main

}//TheoGamboniAssignment12


class Animal {
	private String name;
	private double weight;
	private String food;
	private String location;
	
	Animal(String name, double weight, String food, String location){
		this.name = name;
		this.weight = weight;
		this.food = food;
		this.location = location;
	}//constructor
	
	public String getName() {
		return name;
	}
	public double getWeight() {
		return weight;
	}
	public String getFood() {
		return food;
	}
	public String getLocation() {
		return location;
	}
	
	public void eat() {
		System.out.println("The Animal is Eating");
	}
	public void sleep() {
		System.out.println("The Animal is Sleeping - Do Not Disturb");
	}
	public void swim() {
		System.out.println("The Animal is Swimming");
		
	}
	
	 	
}//Animal

class Bear extends Animal{
	Bear(String name, double weight, String food, String location){
		
		super(name, weight, food, location);
	}
	@Override
	public void eat() {
		System.out.println("The Bear is Eating " + getFood());
	}
	@Override
	public void sleep() {
		System.out.println("The Bear is Sleeping");
	}
	@Override
	public void swim() {
		System.out.println("The Bear is Swimming");
	}
	@Override
	public String toString() {
		
		System.out.printf("Type: Bear\tName: %-8s\t Weight: %7.2f lbs\tLocation: %-2s"
		, getName(),getWeight(), getLocation());
		
		return "";
	}
	
	
}//Bear


class Panther extends Animal{
	Panther(String name, double weight, String food, String location){
		
		super(name, weight, food, location);
	}
	
	@Override
	public void eat() {
		System.out.println("The Panther is eating "+ getFood());
	}
	
	@Override
	public void sleep() {
		System.out.println("The Panther is Sleeping");
	}

	@Override
	public String toString() {
		
		System.out.printf("Type: Panther\tName: %-8s\t Weight: %7.2f lbs\tLocation: %-2s"
		, getName(),getWeight(), getLocation());
		
		return "";
	}
	
}//Panther


class Penguin extends Animal{
	Penguin(String name, double weight, String food, String location){
		
		
		super(name, weight, food, location);
	}
	@Override
	public void eat() {
		System.out.println("The Penguin is eating " + getFood());
	}

	@Override
	public void swim() {
		System.out.println("The Penguin is Swimming");
	}
	
	@Override
	public String toString() {
		
		System.out.printf("Type: Penguin\tName: %-8s\t Weight: %7.2f lbs\tLocation: %-2s"
		, getName(),getWeight(), getLocation());
		
		return "";
	}
	
}//Penguin


class Wolf extends Animal{
	Wolf(String name, double weight, String food, String location){
		
		super(name, weight, food, location);
	}
	@Override
	public String toString() {
		
		System.out.printf("Type: Wolf\tName: %-8s\t Weight: %7.2f lbs\tLocation: %-2s"
		, getName(),getWeight(), getLocation());
		
		return "";
	}
	
}
















