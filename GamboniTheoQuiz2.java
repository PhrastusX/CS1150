import java.util.Scanner;
public class GamboniTheoQuiz2 {

	public static void main(String[] args) {
		
	
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("How many students are in the class?");
		int numberOfStudents = input.nextInt();
		
		int[] grades = new int [numberOfStudents];
		char[] letterGrades = new char [numberOfStudents];
		
		
		getGrades(grades, input);
		
		double average = computeAverage(grades);
		System.out.printf("The average for the class was: %5.2f\n", average);
		
		System.out.println("The number of grades above average was: "+ gradesAboveAverage(grades, average )+"\n");
		
		computeLetterGrades(grades, letterGrades);
		displayGradesAndLetters(grades, letterGrades);

	}//main
	
	
	public static void getGrades(int[] grades, Scanner input) {
		for(int i = 0; i< grades.length; i++) {
			System.out.println("Grade for Student" + (i+1));
			grades[i] = input.nextInt();
		}//for
		
	}//get grades
	
	
	public static double computeAverage (int[] grades) {
		double total = 0;
		double average = 0;
		for(int i = 0; i < grades.length; i++) {
			total += grades[i];
			
		}//for
		average = total/grades.length;
		return average;
	}//computeAverage
	
	
	public static int gradesAboveAverage (int[] grades, double average) {
		int count = 0;
		for(int i = 0; i< grades.length; i++) {
			if (grades[i]> average)
				count++;
		}//for
		return count;
	}//gradesAboveAverage
	
	
	public static void computeLetterGrades (int[] grades, char[] letterGrades) {
		for(int i = 0; i < grades.length; i++) {
			if (grades[i]>=90) {
				letterGrades[i] ='A';
			}
			else if (grades[i]>=80) {
				letterGrades[i]= 'B';
			}
			else if (grades[i]>=70){
				letterGrades[i]= 'C';
			}
			else if (grades[i]>=60) {
				letterGrades[i] = 'D';
			}
			else {
				letterGrades[i] = 'F';
			}//ifs
			
		}//for
		
	}//computeletterGrades
	
	
	public static void displayGradesAndLetters (int[] grades, char[] letterGrades) {
		System.out.printf("Student\t\tExamScore\tLetterGrade\n");
		System.out.println("_________________________________________");
		for(int i = 0; i < grades.length; i++) {
			System.out.printf("%d\t\t%5d\t\t%6c\n", (i+1), grades[i],letterGrades[i]);
		}//for
		
	}//displayGradesandletters
	
}//class


