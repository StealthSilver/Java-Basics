public class first {

    // by convention main function must be public and static
    public static void main(String args[]) {

        // creating objects
        // objects in java are created in heap
        Pen p1 = new Pen(); // created a pen object named p1 in the memory with the new keyword which gives
                            // it space in the memory and the constructor function pen()

        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        p1.setColor("Yellow");
        System.out.println(p1.getColor());

        BankAccount myAcc = new BankAccount();
        myAcc.username = "pogo";
        myAcc.setPassword("vuhifdhi");
    }
}

class Pen {
    // properties and functions

    private String color;
    private int tip;

    // getters
    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    // setters
    void setColor(String newColor) {
        this.color = newColor;
    }

    void setTip(int newTip) {
        this.tip = tip;
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

class BankAccount {
    public String username;
    private String password;

    public void setPassword(String pwd) {
        password = pwd;
    }

}
