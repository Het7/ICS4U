import java.util.Random;

public class DiceRolls {

	public static void main(String[] args) {
		
	    //How many runs you want
	    int numRuns = 5;

	    System.out.println(" Dice1 Dice2 Total");
	 
	    for (int x = 0; x < numRuns; x++) {
	        Random ran = new Random();
	        int dieOne = ran.nextInt(6) + 1;
	        int dieTwo = ran.nextInt(6) + 1;
	        System.out.format("%4d %4d %5d \n", dieOne, dieTwo, dieOne + dieTwo);
	    } 
	}
}



