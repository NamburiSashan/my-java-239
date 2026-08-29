// File: HybridInheritance.java
class Animal {
    void eat() {
        System.out.println("Animal eats food.");
    }
}

interface Flyable {
    void fly();
}

// Bat extends Animal (Class Inheritance) AND implements Flyable (Interface Implementation)
class Bat extends Animal implements Flyable {
    @Override
    public void fly() {
        System.out.println("Bat flies at night.");
    }

    void locateWithSound() {
        System.out.println("Bat uses echolocation.");
    }
}

public class HybridInheritance {
    public static void main(String[] args) {
        Bat bat = new Bat();
        
        // Inherited from Animal class
        bat.eat();
        
        // Implemented from Flyable interface
        bat.fly();
        
        // Method belonging to Bat
        bat.locateWithSound();
    }
}
