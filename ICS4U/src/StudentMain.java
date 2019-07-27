import java.util.Scanner;

class Student {
	private String name;
	private int age, rollNum;
	double score1, score2;

	public Student() {
		name = "";
		age = rollNum = 1; 
		score1 = score2 = 1;
	}

	public String toString(String stName, int stAge, int stRollNum, double stScore1, double stScore2) {
		double avg = ((stScore1 + stScore2) / 2.0);
		return stName + " is " + stAge + "years old.\nTheir roll number is" + stRollNum + ". Their average is " + avg + ".";
	}
	
	public void updName (String newName) {
		name = newName;
	}
	
	public void updAge (int newAge) {
		age = newAge;
	}
	
	public void updRollNum (int newRollNum) {
		rollNum = newRollNum;
	}
	
	public void updScore1 (double newScore1) {
		score1 = newScore1;
	}
	
	public void updScore2 (double newScore2) {
		score2 = newScore2;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getRollNum() {
		return rollNum;
	}
	
	public double getScore1() {
		return score1;
	}
	
	public double getScore2() {
		return score2;
	}
}

public class StudentMain {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Student stud = new Student();

        System.out.print("Enter name: ");
        stud.updName(input.next());
        
        System.out.print("Enter age: ");
        stud.updAge(input.nextInt());

        System.out.print("Enter Roll Number: ");
        stud.updRollNum(input.nextInt());

        System.out.print("Enter Score One: ");
        stud.updScore1(input.nextInt());

        System.out.print("Enter Score Two: ");
        stud.updScore2(input.nextInt());

        System.out.print("\n" + stud.toString(stud.getName(),stud.getAge(), stud.getRollNum(), stud.getScore1(), stud.getScore2()));
    }
}