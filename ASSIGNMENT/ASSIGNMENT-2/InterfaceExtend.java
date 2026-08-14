package lab;
interface R1{
	int rollno = 221;
	String name = "Revanth";
	String section = "CSM-D";
   void one(); 
}
interface R2{
	int rollnumber = 244;
	String peru = "Hemanth";
	String sect = "CSM-D";
	void two();
}
interface I3 extends R2,R1{
	int roll = 246;
	String nam = "Jathin";
	String sec = "CSM-D";
	void three();
}
 class It implements I3{
	public void one() {
		System.out.println("HE GOT 8.23 CGPA");
	}
	public void two() {
		System.out.println("HE GOT 8.69 CGPA");
	}
	public void three() {
		System.out.println("HE GOT 7.13 CGPA");
	}
 }
public class InterfaceExtend {
	public static void main(String[] args) {
		It t = new It();
		System.out.println(R1.name); 
		System.out.println(R1.rollno);
		System.out.println(R1.section);
		t.one();
		System.out.println(R2.peru);
		System.out.println(R2.rollnumber);
		System.out.println(R2.sect);
		t.two();
		System.out.println(I3.nam);
		System.out.println(I3.sec);
		System.out.println(I3.roll);
		t.three();
	}	
}
