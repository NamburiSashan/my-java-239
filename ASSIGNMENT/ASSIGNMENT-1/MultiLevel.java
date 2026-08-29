// File: MultilevelInheritance.java
class Animal {
    void eat() {
        System.out.println("Animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}

// Puppy extends Dog, which extends Animal (Multilevel Chain)
class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy is weeping.");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Puppy puppy = new Puppy();
        
        // Inherited from Animal (Grandparent)
        puppy.eat();
        
        // Inherited from Dog (Parent)
        puppy.bark();
        
        // Method belonging to Puppy
        puppy.weep();
    }
}
