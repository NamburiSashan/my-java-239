package task3;

public class NullPointer {
	    public static void main(String[] args) {
	        String name  = null;
	        try {
	            System.out.println(name.length());
	        } catch (Exception e) {
	            System.out.println("we get an nullpointer exception" + e.getMessage());
	        }
	    }
}
