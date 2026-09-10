package task3;

public class TryNotPresent {
	public static void main(String[] args) {
	    try {
	        throw new TypeNotPresentException("missing class of not same type", new ClassNotFoundException());
	    } catch (TypeNotPresentException tnpe) {
	        System.out.println("the exception is "  + tnpe.getMessage());
	    }
	    finally{
	        System.out.println("catched done");
	    }  
	} 
}
