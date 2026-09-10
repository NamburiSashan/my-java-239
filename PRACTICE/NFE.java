package practice;

public class NFE {
	    public static void main(String[] args) {
	    String inputData = "100g"; 
	    try {
	    int score = Integer.parseInt(inputData);
	    }catch(NumberFormatException nfe) {
	    	System.out.println("error caught.Remove g");
	    }
	    	System.out.println("The score is: " + score);
	    }
	}

