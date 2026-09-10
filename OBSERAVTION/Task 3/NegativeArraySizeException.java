package task3;

public class NegativeArraySizeException {
	public static void main(String[] args) {
        try {
            int max = -20;
            int b[] = new int[max];
        } catch (NegativeArraySizeException nase) {
            System.out.println("catcehd nase" + nase.getMessage());
        }
    }
}
