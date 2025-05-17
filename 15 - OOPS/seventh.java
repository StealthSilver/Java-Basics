
public class seventh {
    public static void main(String args[]) {

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

// Derived class -> hybrid inheritance

class Mammal extends Animal {
    int legs;
}

class Fish extends Animal {
    int fins;
}

class Shark extends Fish {
    int teeth;
}

class Tuna extends Fish {
    int teeth;
}

class Reptiles extends Animal {
    int scales;
}

class Dog extends Mammal {
    int legs;
}

class Cat extends Mammal {
    int legs;
}

class Horse extends Mammal {
    int legs;
}

class Panda extends Mammal {
    int legs;
}