public class first {

    // by convention main function must be public and static
    public static void main(String args[]) {

        // creating objects
        // objects in java are created in heap
        Pen p1 = new Pen(); // created a pen object named p1 in the memory with the new keyword which gives
                            // it space in the memory and the constructor function pen()

        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.color = "Yellow";
        System.out.println(p1.color);

        BankAccount myAcc = new BankAccount();
        myAcc.username = "pogo";
        myAcc.setPassword("vuhifdhi");
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

class BankAccount {
    public String username;
    private String password;

    public void setPassword(String pwd) {
        password = pwd;
    }

}
