package task2;

import java.util.Scanner;

public class EvenOdd {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter an integer:");
	int number = s.nextInt();
	if(number %2 == 0) {
		System.out.println(number +"is Even.");	
	}
	else {
		System.out.println(number +"is Odd.");
	}
	s.close();
  }
}
