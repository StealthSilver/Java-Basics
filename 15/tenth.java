
public class tenth {
    public static void main(String args[]) {
        Horse h = new Horse();
        h.eat();
        h.walk();

        Chicken c = new Chicken();
        c.eat();
        c.walk();

        // the constructors are called in an hierarchy animal -> horse -> mustang
        Mustang m = new Mustang();

    }
}

// abstract class

abstract class Animal {

    // cannot create the object of this class but can create constructors
    void eat() {
        System.out.println("animal eats");
    }

    abstract void walk(); // no implementation of this method -> implementation will depend on the
                          // derived classes

    Animal() {
        System.out.println("animal constructor called");
    }
}

class Horse extends Animal {
    void walk() {
        System.out.println("walks on four legs");
    }

    Horse() {
        System.out.println("horse constructor called");
    }

}

class Mustang extends Horse {
    Mustang() {
        System.out.println("mustang constructor called");
    }
}

class Chicken extends Animal {
    void walk() {
        System.out.println("walks on 2 legs");
    }
}