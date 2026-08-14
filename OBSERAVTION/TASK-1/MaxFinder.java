package task2;

public class MaxFinder {
	public static double findmax(double num1,double num2) {
		if (num1 >= num2) {
			return num1;
		}
		else {
			return num2;
		}
	}
	public static void main(String[] args) {
		double a = 14.5;
		double b = 27.8;
		double max = findmax(a,b);
		System.out.println("the maximum between" + a + "and" + b + "is" + max);
	}

}
