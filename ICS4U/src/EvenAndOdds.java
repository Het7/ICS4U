import java.util.Scanner;
public class EvenAndOdds {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [] randomNum = new int [25];
		for (int i=0; i < randomNum.length; i++) {
			randomNum[i] = (int) (99*Math.random()+1);	
		}
		
		System.out.println("Even");
		for (int i=0; i<randomNum.length; i++) {
			if (randomNum[i]%2==0) {
				System.out.print(randomNum[i] + " ");
			}
		}

		System.out.println("");
		System.out.println("Odd");
		for (int l=0; l<randomNum.length; l++) {
			if(randomNum[l]% 2 != 0) {
				System.out.print(randomNum[l] + " ");
			}
		}
	}

}
