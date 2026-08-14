package task2;

public class CircleArea {
	public static double calculateArea(double radius) {
		if (radius < 0) {
			throw new IllegalArgumentException("Radius cannot be negative");
		}
		return Math.PI*radius*radius;
	}
	public static void main(String[] args) {
		double r = 7.0;
		double area = calculateArea(r);
		System.out.println("Area of Circle with Radius" + r + "is" + area);
	}

}
