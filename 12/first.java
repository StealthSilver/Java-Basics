public class first {

    // by convention main function must be public and static
    public static void main(String args[]) {

        // creating objects
        // objects in java are created in heap
        Pen p1 = new Pen(); // created a pen object named p1 in the memory with the new keyword which gives
                            // it space in the memory and the constructor function pen()

    }
}

class Pen {
    // properties and functions

    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

class Student {

    // attributes
    String name;
    int age;
    float percentage;

    // methods
    void calcPercentage(int phy, int chem, int math) {
        percentage = (phy + chem + math) / 3;
    }
}