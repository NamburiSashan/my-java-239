package lab;
interface I1{
	String name = "Revanth";
	void sample();
}
interface I2 extends I1{
	int rollno = 221;
	void demo();
}
class Multi implements I1,I2{
	public void sample() {
		System.out.println("He is second year");
	}
	public void demo() {
		System.out.println("From CSM-D");
	}
	void college() {
		System.out.println("From ANITS");
	}
}

public class Interface {
	public static void main(String[] args) {
		Multi m = new Multi();
		System.out.println(I1.name);
		System.out.println(I2.rollno);
		m.demo();
		m.sample();
		m.college();
	}

}
