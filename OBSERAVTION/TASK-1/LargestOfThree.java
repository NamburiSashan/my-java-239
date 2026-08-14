package task2;
import java.util.Scanner;

public class LargestOfThree {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number:");
		int num1 = s.nextInt();
		System.out.println("Enter second number:");
		int  num2 = s.nextInt();
		System.out.println("Enter third number:");
		int num3 = s.nextInt();
		if(num1>=num2 && num1>=num3) {
			System.out.println(num1 + "is the largest number");
		}
		else if(num2>=num1 && num2>=num3) {
			System.out.println(num2 + "is the largest number");
		}
		else {
			System.out.println(num3 + "is largest number");
		}
		s.close();
	}
}
