public class PythagoreanTriple {


	public static void main(String[] args) {

		for (int a =1; a<100; a++){
			for (int b=a; b<100; b++){ // Ensuring no repeats  
				int cSquared = (a*a)+(b*b);
				if (perfectSquare(cSquared)){
					int c = (int)(Math.sqrt(cSquared));
					System.out.println(a + " " + " " + b + " " + c); // Printing the triplets if condition is true 
				}
			}
		}
	}

	//Perfect Square Method

	public static Boolean perfectSquare(int num){
		Boolean isPerfSquare = false;

		int sqRoot = (int)(Math.sqrt(num));
		if (Math.pow(sqRoot, 2) == num){
			isPerfSquare = true;
		}
		return isPerfSquare;
	}
}


