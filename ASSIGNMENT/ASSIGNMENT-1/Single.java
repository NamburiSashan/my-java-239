package lab;
class Onee{
	int a = 20;
	void sum() {
		System.out.println("sum is:" + (a+30));
	}
}
class Two extends Onee {
	int b = 78;
	Onee o = new Onee(); 
	void sub() {
		System.out.println("sub is:" + (b-9));
	}
}

public class Single {
	public static void main(String[] args) {
		Two t = new Two();
		System.out.println("can access:" + t.a);
		System.out.println("can:" + t.b);
		t.sum();
		t.sub();
	}
}
