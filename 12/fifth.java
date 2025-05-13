
public class fifth {
    public static void main(String args[]) {
        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs = 4;
    }
}

// base class
class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breaths");
    }
}

// Derived class -> multi level inheritance

class Mammal extends Animal {
    int legs;
}

class Dog extends Mammal {
    String breed;
}