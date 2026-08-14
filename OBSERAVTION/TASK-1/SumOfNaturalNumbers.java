package task2;

import java.util.Scanner;

public class SumOfNaturalNumbers {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of N");
		int n = s.nextInt();
		int sum = n*(n+1)/2;
		System.out.println("The sum of the first" + n + "natural numbers is::" + sum);
		s.close();
	}
}
