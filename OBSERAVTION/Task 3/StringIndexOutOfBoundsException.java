package task3;

public class StringIndexOutOfBoundsException {
	    public static void main(String[] args) {
	        String Name = "Revanth";
	        try {
	            System.out.println(Name.charAt(9));
	        } catch (StringIndexOutOfBoundsException sioobe) {
	            System.out.println("we caught an exception called sioobe" + sioobe.getMessage());

	        }
	        finally{
	            System.out.println("we get sioobe exception");
	        }
	 }
}
