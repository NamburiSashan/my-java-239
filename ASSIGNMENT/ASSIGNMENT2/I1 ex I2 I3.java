// File: Main.java

// First parent interface
interface I2 {
    void methodFromI2();
}

// Second parent interface
interface I3 {
    void methodFromI3();
}

// Child interface extending BOTH I2 and I3 (separated by a comma)
interface I1 extends I2, I3 {
    void methodFromI1();
}

// Concrete class implementing the child interface I1
class C1 implements I1 {

    @Override
    public void methodFromI2() {
        System.out.println("Implementation of method from I2");
    }

    @Override
    public void methodFromI3() {
        System.out.println("Implementation of method from I3");
    }

    @Override
    public void methodFromI1() {
        System.out.println("Implementation of method from I1");
    }
}

public class Main {
    public static void main(String[] args) {
        C1 obj = new C1();

        // Must implement all 3 methods across the interface inheritance chain
        obj.methodFromI2();
        obj.methodFromI3();
        obj.methodFromI1();
    }
}
