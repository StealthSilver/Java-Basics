
public class tenth {
    public static void main(String args[]) {
        Horse h = new Horse();
        h.eat();
        h.walk();

        Chicken c = new Chicken();
        c.eat();
        c.walk();
    }
}

// abstract class

abstract class Animal {
    void eat() {
        System.out.println("animal eats");
    }

    abstract void walk(); // no implementation of this method
}

class Horse extends Animal {
    void walk() {
        System.out.println("walks on four legs");
    }

}

class Chicken extends Animal {
    void walk() {
        System.out.println("walks on 2 legs");
    }
}