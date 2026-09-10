package practice;

public class ThrowsAndThrow {
	public static void validateAge(int age) throws Exception{
		if (age < 18) {
	    throw new Exception("Access Denied: You must be at least 18 years old.");
	    }
	   
	    System.out.println("Access Granted: Welcome to the system!");
	    }

	    public static void main(String[] args) {
	    try {
	    validateAge(20); 
	    } catch (Exception e) {
	    System.out.println("Caught an error in main: " + e.getMessage());
	    }
	   
	    System.out.println("The program continues to run safely...");
	    }

	}

