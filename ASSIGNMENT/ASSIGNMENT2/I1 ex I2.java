// File: Main.java

// Parent Interface
interface I2 {
    void methodFromI2();
}

// Child Interface extending Parent Interface
interface I1 extends I2 {
    void methodFromI1();
}

// Class implementing the child interface (must fulfill both contracts)
class C1 implements I1 {
    
    @Override
    public void methodFromI2() {
        System.out.println("Implementation of method from I2 (Parent Interface)");
    }

    @Override
    public void methodFromI1() {
        System.out.println("Implementation of method from I1 (Child Interface)");
    }
}

public class Main {
    public static void main(String[] args) {
        C1 obj = new C1();

        obj.methodFromI2();
        obj.methodFromI1();
    }
}
