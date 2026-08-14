package task2;
import java.util.Scanner;


public class FactorialCalculator {
	static int factorial(int n) {
		int fact = 1;
		for(int i = 1;i <= n;i++) {
			fact = fact*i;
		}
		return fact;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n,result;
		System.out.println("Enter the number");
		n = s.nextInt();
		result = factorial(n);
		System.out.println("factorial = " + result);
		s.close();
	}
}
