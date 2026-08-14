package task2;
import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = s.nextInt();
		System.out.println("Multipication Taable for" + num + ":");
		for(int i = 1; i <= 10; i++) {
			System.out.println(num + "x" + i + "=" + (num * i));
		}
		s.close();
	}
}
