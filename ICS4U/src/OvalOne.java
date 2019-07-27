import java.util.Scanner;

class Oval {
	double length;
	double width;

	public Oval() {
		this.length =1;
		this.width=2;
	}

	public void setWidth(double w) {
		width =w;
	}

	public double getWidth() {
		return width;
	}

	public void setLength(double l) {
		length =l;
	}

	public double getLength() {
		return length;
	}
	
	public String toString(){
		String area;
		area = "The area of the oval is " + ((length*width)*0.8) + ".";
		return area;
	}
}

public class OvalOne {
	public static void main(String[] args) {

		Oval OvalObject = new Oval();

		Scanner console = new Scanner(System.in);	
		System.out.print("Enter width:");
		OvalObject.setWidth(console.nextDouble());
		System.out.print("Enter length:");
		OvalObject.setLength(console.nextDouble());
		System.out.print(OvalObject.toString());
	}
}