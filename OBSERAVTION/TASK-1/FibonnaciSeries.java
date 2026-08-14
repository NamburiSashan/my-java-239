package task2;

import java.util.Scanner;

public class FibonnaciSeries {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of terms(N):");
		int n= s.nextInt();
		int first = 0, second = 1;
		System.out.println("Fibonacci Series up to" + n + "terms:");
		for (int i = 1;i <= n; i++) {
			System.out.println(first + "");
			int next = first + second;
			first = second;
			second = next;
		}
		s.close();
	}
}
