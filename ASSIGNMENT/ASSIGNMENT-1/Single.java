// File: SingleInheritance.java
class Animal {
    void eat() {
        System.out.println("Animal eats food.");
    }
}

// Dog extends Animal (Single Inheritance)
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        
        // Method inherited from Animal
        dog.eat();
        
        // Method belonging to Dog
        dog.bark();
    }
}
