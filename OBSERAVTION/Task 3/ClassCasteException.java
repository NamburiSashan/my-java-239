package task3;

public class ClassCasteException {
	    public static void main(String[] args) {
	        try {
	            Object obj = "Java";
	            Integer n = (Integer) obj;
	        } catch (ClassCastException e) {
	            System.out.println("Invalid type casting");
	     }
    }
}
