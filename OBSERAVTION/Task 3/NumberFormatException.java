package task3;

public class NumberFormatException {
	    public static void main(String[] args) {
	        String val = "Revanth9999";
	        try {
	            int number = Integer.parseInt(val);
	            System.out.println();
	        } catch (NumberFormatException nfe) {
	            System.out.println("we catch an nfe" + nfe.getMessage());
	        }
	    }
}
