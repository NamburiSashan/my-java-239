package task1;

public class Polymorphism {
	static class Area{
	double area (double radius){
	   return 3.14*radius*radius;
	}
	int area(int length ,int breadth){
	   return length*breadth;
	}
	double area(double b, double h){
	  return 0.5*b*h;
	}
}
		public static void main(String[] args) {
		Area a = new Area();
		System.out.println("area of circle "+ a.area(5));
		System.out.println("area of rectangle"+a.area(10,5));
		System.out.println("area of triangle" + a.area(3,5));
		}
}
