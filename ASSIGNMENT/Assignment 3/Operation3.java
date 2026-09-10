package stringoperations;

public class Operation3 {
	public static void main(String[] args) {
        String man = "practice questions";
        String s1 = man.substring(9);
        String s2 = man.substring(0,8);
        int n = man.length();
        char f = man.charAt(9);
        System.out.println("String is "  + man);
        System.out.println("1st Substring is " + s1);
        System.out.println("2nd Substring is "  + s2);
        System.out.println("Length is " + n);
        System.out.println("The character is " + f);
    }
}
