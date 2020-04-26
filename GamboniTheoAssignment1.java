/*
 * Name: Theophrastus Gamboni-Diehl
 * Class: CS1150
 * Section:3
 * Due: Jan 30, 2020
 * Description: Assignment #1
 * This program demonstrates that I understand basic program structure
 * by printing a couple paragraphs that tell the instructor what I'm passionate about.
 * It also gives a little practice with arithmetic in Java.
*/
public class GamboniTheoAssignment1 {
	public static void main(String[] args) {
		
		System.out.println("\tHello my name is Theo. I'm 28 years old.\n"
				+ "I was born in Grants Pass, Oregon. I don't really\n"
				+ "like talking about myself at all.  I enjoy learning to\n"
				+ "code. So far i've  learned a little bit of python, javascript,\n"
				+ "and java. My major is computer science, and this is the first\n"
				+ "formal class I've taken.\n"
				+ "\tI really enjoy the outdoors. When I have free time I'll be outside.\n"
				+ "My favorite thing to do is ride my bike. I enjoy mountain biking but \n"
				+ "riding around the city is also enjoyable.  In the winters I love to snowboard.\n"
				+ "My favorite place to go is breckenridge because they have a huge amount\n"
				+ "of terrain. I can also get there the back way and avoid traffic :)");
		System.out.println();
		
		double pesos, pounds, canadian;
		
		pesos = 18.80;
		pounds = .77;
		canadian = 1.30;
		
		System.out.println("Dollars  Pesos  Pounds  Canadian");
		System.out.println("--------------------------------");
		System.out.println("$1       "+pesos+"     "+pounds+"     "+canadian  );
		System.out.println("$5       "+pesos*5+"     "+pounds*5+"     "+canadian*5  );
		System.out.println("$10      "+pesos*10+"    "+pounds*10+"      "+canadian*10  );
		System.out.println("$20      "+pesos*20+"    "+pounds*20+"     "+canadian*20  );
		System.out.println("$50      "+pesos*50+"    "+pounds*50+"     "+canadian*50  );
		System.out.println("$100     "+pesos*100+"   "+pounds*100+"     "+canadian*100  );
	}
}
