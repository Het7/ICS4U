import java.util.Scanner;
import java.util.ArrayList;


public class StudentApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.print("How many courses did you take during the school year? : ");
	    int takeCoursesNum = sc.nextInt();

	    int grades[] = new int[takeCoursesNum]; // array number start "0" ~ ex) { [0], [1], [2] }

	    for (int i = 0; i < takeCoursesNum; i++) {
	        System.out.print("Enter your grade for that course : ");
	        int grade = sc.nextInt();
	        grades[i] = grade;
	    }

	    System.out.print("\nGrades below 65 : ");
	    for (int i = 0; i < takeCoursesNum; i++) {
	        if (grades[i] < 65) {
	            System.out.print(grades[i] + " ");
	        }
	    }

	    System.out.print("\nGrades below 90 : ");
	    for (int i = 0; i < takeCoursesNum; i++) {
	        if (grades[i] > 90) {
	            System.out.print(grades[i]+ " ");
	        }
	    }

	    System.out.print("\nGrades between 65 and 90: ");
	    for (int i = 0; i < takeCoursesNum; i++) {
	        if (grades[i] > 65 && grades[i]<=90) {
	            System.out.print(grades[i]+ " ");
	        }
	    }

	}

}
