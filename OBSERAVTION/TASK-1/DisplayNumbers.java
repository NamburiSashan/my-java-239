package task2;

import java.util.Scanner;

public class DisplayNumbers {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of N:");
		int n = s.nextInt();
		System.out.println("Numbers from 1 to" + n + ":");
		for(int i = 1;i <= n; i++) {
			System.out.println(i + "");
		}
		s.close();
	}
}
