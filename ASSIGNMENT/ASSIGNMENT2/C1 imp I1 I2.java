// File: Main.java

// First interface
interface I1 {
    void printMessage1();
}

// Second interface
interface I2 {
    void printMessage2();
}

// C1 implements both I1 and I2
class C1 implements I1, I2 {
    
    @Override
    public void printMessage1() {
        System.out.println("Implementation of method from I1");
    }

    @Override
    public void printMessage2() {
        System.out.println("Implementation of method from I2");
    }
}

public class Main {
    public static void main(String[] args) {
        C1 obj = new C1();

        // Calling methods from both implemented interfaces
        obj.printMessage1();
        obj.printMessage2();

        System.out.println();

        // Using Interface reference variables (Polymorphism)
        I1 ref1 = new C1();
        ref1.printMessage1(); // Can call I1 methods

        I2 ref2 = new C1();
        ref2.printMessage2(); // Can call I2 methods
    }
}
