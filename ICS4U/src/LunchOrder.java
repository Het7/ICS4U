import java.util.Scanner;
import java.lang.String;
import java.text.NumberFormat;

public class LunchOrder {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double totalCost = 0;
		NumberFormat money = NumberFormat.getCurrencyInstance();

		System.out.print("Enter number of hamburgers: ");
		double hamburgerTotal = input.nextInt();
		Food foodOne = new Food("Hamburger", 1.85, 9.0, 33, 1, hamburgerTotal);
		System.out.println(foodOne + "\n");
		totalCost += foodOne.getTotalCost(); 

		System.out.print("Enter number of salads: ");
		double saladTotal = input.nextInt();
		Food foodTwo = new Food("Salad", 2.00, 1, 11, 5, saladTotal);
		System.out.println(foodTwo + "\n");
		totalCost += foodTwo.getTotalCost();

		System.out.print("Enter number of french fries: ");
		double frenchFrieTotal = input.nextInt();
		Food foodThree = new Food("French fries", 1.30, 11, 36, 4, frenchFrieTotal);
		System.out.println(foodThree + "\n");
		totalCost += foodThree.getTotalCost();

		System.out.print("Enter number of sodas: ");
		double sodaTotal = input.nextInt();
		Food foodFour = new Food("Soda", 0.95, 0, 38, 0, sodaTotal);
		System.out.println(foodFour + "\n"); 
		totalCost += foodFour.getTotalCost();

		System.out.println("Your order comes to: "+money.format(totalCost));
	}
}

class Food {
	String item;
	double price;
	double fat;
	double carb;
	double fiber;
	double total;
	double foodTotal;
	double totalCost;
	NumberFormat money = NumberFormat.getCurrencyInstance();

	public  Food (String nItem, double nPrice, double nFat, double nCarb, double nFiber, double hamburgerTotal) {
		item = nItem;
		price = nPrice;
		fat = nFat;
		carb = nCarb;
		fiber = nFiber;
		foodTotal = hamburgerTotal;
		totalCost = totalCost +(price * foodTotal);
	}

	public void total() {
		double totalCost = price * foodTotal;
		totalCost += (price * foodTotal);
		System.out.print(totalCost);
	}

	public double getTotalCost(){ 
		return totalCost; 
	}

	public String toString() {
		String orderString;

		orderString =  "Each " + item + " has " + fat + "g of fat, "
				+ carb + "g of carbs, and " + fiber + ".g of fiber.";
		return(orderString);
	}
}