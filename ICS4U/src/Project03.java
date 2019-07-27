import java.util.Scanner;

public class Project03 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Difficulty?");
		String difficulty = keyboard.nextLine();


		Scanner keyboard1 = new Scanner(System.in);
		System.out.print("\nHow many questions? : ");
		String n = keyboard1.nextLine();
		int x = Integer.parseInt(n); 

		int correct = 0;
		if (difficulty.equals("simple"))  {
			for (int i  = 0; i < x; i++) {
				if (simple()) {
					correct += 1;
				}
			}
		}

		if (difficulty.equals("difficult"))  {
			for (int i  = 0; i < x; i++) {
				if (difficult()) {
					correct += 1;
				}
			}
		}

		System.out.println("You got" + " " + String.valueOf(correct) + " " + "correct");
	}

	public static boolean simple() {
		int randomNumber1 =  (int)(20 * Math.random()) + 1;
		int randomNumber2 =  (int)(20 * Math.random()) + 1;
		Scanner keyboard1 = new Scanner(System.in);
		System.out.print("\n" + String.valueOf(randomNumber1) + "+" + String.valueOf(randomNumber2 + "="));
		String answer = keyboard1.nextLine();
		int x = Integer.parseInt(answer); 

		if(randomNumber1 + randomNumber2 == x) {
			return true; 
		}

		else {
			return false; 
		}
	}
	public static boolean difficult() {
		int randomNumber1 =  (int)(20 * Math.random()) + 1;
		int randomNumber2 =  (int)(20 * Math.random()) + 1;
		Scanner keyboard1 = new Scanner(System.in);
		System.out.print("\n" + String.valueOf(randomNumber1) + "*" + String.valueOf(randomNumber2 + "="));
		String answer = keyboard1.nextLine();
		int x = Integer.parseInt(answer); 

		if(randomNumber1 * randomNumber2 == x) {
			return true; 
		}

		else {
			return false; 
		}
	}
}


