package lab;
abstract class One{
	int a = 221;
	void d() {
	System.out.println("this is rollno:" + a);
}
	abstract void c();
}

public class Lab extends One{
	void c() {
		System.out.println("---This is from subclass---");
		System.out.println("My name is Revanth");
	}
	public static void main(String[] args) {
		Lab l = new Lab();
		l.d();
		l.c();		
	}
 }

