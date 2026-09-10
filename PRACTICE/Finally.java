package practice;

public class Finally {
	public static void main(String[] args) {
		try {
			System.out.println("1. Inside try block");
	        int data = 10 / 0; 
	        } catch (ArithmeticException e) {
	        System.out.println("caught the error");
	        } finally {
			System.out.println(data + "\nexecute program");
	        }

	        System.out.println("4. Program continues...");
	    }
	}
