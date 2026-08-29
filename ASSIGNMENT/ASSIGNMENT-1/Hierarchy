// File: HierarchicalInheritance.java
class Animal {
    void eat() {
        System.out.println("Animal eats food.");
    }
}

// Dog inherits from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}

// Cat also inherits from Animal (Hierarchical)
class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows.");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        
        System.out.println("--- Dog Behavior ---");
        dog.eat(); // Shared parent method
        dog.bark();
        
        System.out.println("\n--- Cat Behavior ---");
        cat.eat(); // Shared parent method
        cat.meow();
    }
}
