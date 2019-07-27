import java.util.Scanner;

public class CountVowels {


	public static void main(String args[]) {
		System.out.println("Enter text :");
		Scanner s = new Scanner(System.in);                  

		String input = s.nextLine();
		char[] letters = input.toCharArray();

		int count = 0;

		for (char c : letters) {
			switch (c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				count++;
			}
		}
		System.out.println("Number of vowels in " + input + " is " + count + ".");
	}
}