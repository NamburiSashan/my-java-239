// File: Main.java

// Superclass (Parent class)
class Class2 {
    String parentMessage = "Hello from Class2 (Parent)!";

    void showParentMessage() {
        System.out.println(parentMessage);
    }
}

// Subclass (Child class extending Class2)
class Class1 extends Class2 {
    String childMessage = "Hello from Class1 (Child)!";

    void showChildMessage() {
        System.out.println(childMessage);
    }
}

// Main execution class
public class Main {
    public static void main(String[] args) {
        // Create an instance of the subclass (Class1)
        Class1 obj = new Class1();

        // Accessing Class2 (Parent) methods and variables through Class1 object
        obj.showParentMessage();

        // Accessing Class1 (Child) methods and variables
        obj.showChildMessage();
    }
}
