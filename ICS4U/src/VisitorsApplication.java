// Name: Het Parikh
// Date: July 15, 2019
// Description: This program prompts the user to input the number of visitors for 
//				past five days and then displays the average number of visitors. 

import java.util.Scanner;
public class VisitorsApplication {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);


		System.out.print("Enter the number of visitors on day 1:");
		int d1 = s.nextInt();

		System.out.print("Enter the number of visitors on day 2:");
		int d2 = s.nextInt();

		System.out.print("Enter the number of visitors on day 3:");
		int d3 = s.nextInt();

		System.out.print("Enter the number of visitors on day 4:");
		int d4 = s.nextInt();

		System.out.print("Enter the number of visitors on day 5:");
		int d5 = s.nextInt();

		s.close();
		getAverage(d1, d2, d3, d4, d5);
	}

// Precondition: None 
// Postcondition: Average of the inputs displayed. 
	public static void getAverage(int d1, int d2, int d3, int d4, int d5) {
		int Average = (d1 + d2 + d3 + d4 + d5)/5 ; 

		System.out.println("The average number of visitors" + " " + Average + ".");
	}
}
