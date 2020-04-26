import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {

	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File file = new File("/Users/theo/eclipse-workspace/CS 1150/Assignment11.txt");
		Scanner scan = new Scanner(file);
		String myCars ="";

	
		String firstOwner = scan.nextLine();
		String firstMake = scan.nextLine();
		Double firstMpg = scan.nextDouble();
		
	
		
		
		
	}//main
		

}//FileReader


