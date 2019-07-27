// Name: Het Parikh
// Date: July 16, 2019
// Description: Program prints the ones, tens, hundreds, and complete integer inputted
// 				by the user by making use of an object.  

import java.util.Scanner;

class Methods { 
	
	int hundreds;
	int tens;
	int ones;

	public Methods (int value) {}

	public int getHundreds(int num) {
		return (num /100)%10;
	}

	public int getTens (int num) {
		return (num / 10)%10;
	}

	public int getOnes (int num) {
		return num % 10;
	}
}

public class DigitExtractor {

	public static void main(String[] args) throws java.io.IOException {

		try (Scanner input = new Scanner(System.in)){

			System.out.print("Input an integer from 100-999: ");
			int integer = input.nextInt();
			Methods num = new Methods(integer);
			char keyboard;

			do {
				System.out.println("\nshow (W)hole number.");
				System.out.println("show (O)nes place number.");
				System.out.println("show (T)ens place number.");
				System.out.println("show (H)undreds place number.");
				System.out.println("(Q)uit");
				System.out.print("Enter your choice: ");
				keyboard = input.next().charAt(0);

				if (keyboard == 'W' || keyboard == 'w') {
					System.out.println("The whole number is: " + integer);
				} else if (keyboard == 'O' || keyboard == 'o') {
					System.out.println("The ones place digit is: " + num.getOnes(integer));
				} else if (keyboard == 'T' || keyboard == 't') {
					System.out.println("The tens place digit is: " + num.getTens(integer));
				} else if (keyboard == 'H' || keyboard == 'H') {
					System.out.println("The hundreds place digit is: " + num.getHundreds(integer));
				}
			} while ((keyboard != 'q') && (keyboard != 'Q'));
		}
	}
}