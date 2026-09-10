package practice;

public class NPE {
    public static void main(String[] args) {
    String text = null;
    int length = text.length();
   
    System.out.println("Text length is: " + length);
    }
}

