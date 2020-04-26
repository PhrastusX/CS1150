import java.util.Scanner;
public class PracticeQuiz1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("please enter a character for:\n"
				+ " C = Computer science, I = Information Technology, M = Mathmatics\n"
				+ "please enter a character for year:\n"
				+ " 1 = Freshman, 2 = Sophmore, 3=Junior, 4= Senior");
		
		String inputValue = input.next().toUpperCase();
		
		if (inputValue.length() == 2) {

			char valueForMajor = inputValue.charAt(0);
			char valueForYear = inputValue.charAt(1);
			String major = "";
			String year = "";
		
			if ((valueForMajor == 'C' || valueForMajor =='I'|| valueForMajor == 'M')
				&& (valueForYear >= '1'&& valueForYear <='4')) {
				if (valueForMajor == 'C') {
				major = "Computer Science";
				}
				else if (valueForMajor == 'I') {
					major = "Information Technology";
				}
				else if (valueForMajor == 'M') {
					major = "Mathmatics";
				}
				if (valueForYear == '1') {
					year = "Freshmen";
				}
				else if (valueForYear == '2') {
					year = "Sophmore";
				}
				else if (valueForYear == '3') {
					year = "Junior";
				}
				else if (valueForYear == '4') {
					year = "Senior";
				}
			
				System.out.printf("%s %s",major,year);
					
			}
			else {
				System.out.println("please input correct values");
			}
		
		
		
		}
		else {
			System.out.println("Please enter the correct number of characters");
		}
	}

}
