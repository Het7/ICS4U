import java.util.Scanner;

public class QuadraticCalculator {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		// Declaring Variables
		double a = 0;
		double b = 0;
		double c = 0;
		double disc = 0;
		double x1 = 0;
		double x2 = 0;
		
		// Value Inputs
		System.out.println("Input the values a, b, and c for ax^2+bx+c = 0");
		System.out.print("Input a: ");
		a = s.nextDouble();
		System.out.print("Input b: ");
		b = s.nextDouble();
		System.out.print("Input c: ");
		c = s.nextDouble();
		
		// Calculations
		disc = Math.pow(b,2)-4*a*c;
		
		if (disc > 0) {
			x1= (-b+Math.sqrt(b*b-4*a*c))/(2*a);
			x2= (-b-Math.sqrt(b*b-4*a*c))/(2*a);
			
			System.out.println("x1 = " +x1);
			System.out.println("x2 = " +x2);
		}
		
		else if (disc == 0) {
			x1= (-b+Math.sqrt(b*b-4*a*c))/(2*a);
			System.out.println("There is one real root at x = "+x1);
		}
		else {
			System.out.println("There are no real roots");
		}
		}	
	}