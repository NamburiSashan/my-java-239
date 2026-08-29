// File: MultipleInheritance.java
interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

// Duck implements multiple interfaces
class Duck implements Flyable, Swimmable {
    @Override
    public void fly() {
        System.out.println("Duck is flying in the sky.");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming in the water.");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Duck duck = new Duck();
        
        duck.fly();
        duck.swim();
    }
}
