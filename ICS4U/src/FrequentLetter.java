import java.util.Scanner;

public class FrequentLetter {

	public static void main(String[] args) {
		Scanner Word = new Scanner (System.in);

		System.out.print("Enter a word: ");
		String name = Word.nextLine();
		int nameLength = name.length();
		String changeCase = name.toLowerCase();
		char[] nameLetters = changeCase.toCharArray(); 


		if(nameLength >= 6) {

			if(nameLetters[2] == 'a' || nameLetters[2]=='e'|| nameLetters[2]=='s'|| nameLetters[2]=='r') {
				System.out.print("The third letter of the word is a frequent letter as it is the letter " + nameLetters[2] + "." );
			}

			else {
				System.out.print("The third letter of the word is not a frequent letter. ");
			}
		}
		else {
			System.out.print("Enter a word with at least 6 characters.");
		}
	}
}
