
public class sixth {
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

// Derived class -> hierarchial inheritance

class Mammal extends Animal {
    int legs;
}

class Fish extends Animal {
    int fins;
}

class Reptiles extends Animal {
    int scales;
}
