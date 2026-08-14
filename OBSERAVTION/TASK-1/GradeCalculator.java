package task2;

import java.util.Scanner;

public class GradeCalculator {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter percentage(0-100):");
		double percentage = s.nextDouble();
		if(percentage<0||percentage>100) {
			System.out.println("Invalid input! percentage must be between 0 to 100");
		}
		else if (percentage >= 90){
			System.out.println("Grade: O");
		}
		else if (percentage >= 80) {
			System.out.println("Grade: A+");
		}
		else if(percentage >= 70) {
			System.out.println("Grade: A");
		}
		else if(percentage >= 60) {
			System.out.println("Grade: B");
		}
		else if(percentage >= 50) {
			System.out.println("Grade: C");
		}
		else if(percentage >= 40) {
			System.out.println("Grade: D");
		}
		else {
			System.out.println("Grade: F");
		}
		s.close();
	}
}
