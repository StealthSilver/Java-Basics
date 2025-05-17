// ovveriding
public class ninth {
    public static void main(String args[]) {
        Deer d = new Deer();
        d.eat(); // calls the function from the child class
    }
}

class Animal {
    void eat() {
        System.out.println("eats anything");
    }
}

class Deer extends Animal {
    void eat() {
        System.out.println("eats grass");
    }
}