// Name: Het Parikh 
// Date: July 15, 2019
//Description: An application that displays the total money by prompting the user to input the 
//				number of pennies, nickels, dimes, and quarters.

import java.util.Scanner;
public class AddCoin {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number of pennies: ");
		int p = s.nextInt();
		System.out.print("Enter number of nickels: ");
		int n = s.nextInt();
		System.out.print("Enter number of dimes: ");
		int d = s.nextInt();
		System.out.print("Enter number of quarters: ");
		int q = s.nextInt();
		s.close();

// Precondition: None 
// Postcondition: Displays the total 
		getDollarAmount(p, n, d, q) ;
	}

	static void getDollarAmount(int p, int n, int d, int q) {
		System.out.printf("Your Total is: $ %.2f\n", p*0.01 + n*0.05 + d*0.1 + q*0.25);		
	}
}
