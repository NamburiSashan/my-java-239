package lab;
class animal{
    String name = " Lion,Tiger,Cheetah";
	void wild(){
    System.out.println(" Cheetah is the my favourite wild animal");
	}
}
class bird extends animal{
   String names = "EAGLE,PENGUIN";
	 void fly(){
	   System.out.println("EAGLE is my favourite bird");
    }
}
class sea extends bird {
	String namess = "MEGALODON SHARK,KILLER WALES";
	void water() {
		System.out.println("MEGALODON is my favourite shark"); 
    }
}
public class MultiLevel {
    public static void main(String[] args) {
		     sea s = new sea(); 
		System.out.println(s.name);
		s.wild();
		System.out.println(s.names);
		s.fly();
		System.out.println(s.namess);
		s.water();
		    }
		}
