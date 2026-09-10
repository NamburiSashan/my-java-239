package practice;
public class MultiCatch {
	public static void main(String[] args) {
		try {
			int[] numbers = {10, 20};
			int result = numbers[5]; 
			} catch (ArithmeticException ae) {
				System.out.println("Error caught: " + ae.getClass().getSimpleName());
				}
		
		        catch(ArrayIndexOutOfBoundsException e){
		        System.out.println("Error caught: " + e.getClass().getSimpleName());
		        }
		        System.out.println("Program finishes successfully.");
	  }
}