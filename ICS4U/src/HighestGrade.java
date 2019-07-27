import java.util.ArrayList;
import java.util.Scanner;

public class HighestGrade {

  public static void main(String[] args){
    Scanner scan =  new Scanner(System.in);
    ArrayList<Integer> scores = new ArrayList<Integer>();
    int greatest = -1;

    while (scores.size()<5) {
      System.out.print("Enter a grade (between 0 and 100): ");
      int input = scan.nextInt();
      if (input <= 100 && input >= 00) {
        scores.add(input);
        if(input >= greatest)
          greatest = input;

      }
      else{
        System.out.println("Error: Make sure the grade is between 0 and 100!\nEnter a new grade!");
      }
    }

    System.out.println("\nThe highest grade is: "+greatest);

  }
}