// File: Main.java

// Define the interface
interface I1 {
    // Interface method (implicitly public and abstract)
    void showMessage();
}

// C1 implements the I1 interface
class C1 implements I1 {
    // Must provide an implementation for the interface method
    @Override
    public void showMessage() {
        System.out.println("Hello from C1 implementing interface I1!");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an object of class C1
        C1 obj = new C1();
        obj.showMessage();

        // Interface reference pointing to a C1 instance (Polymorphism)
        I1 ref = new C1();
        ref.showMessage();
    }
}
