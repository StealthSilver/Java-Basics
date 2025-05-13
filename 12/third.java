public class third {
    public static void main(String args[]) {

        Student s1 = new Student();
        s1.name = "pogo";
        s1.roll = 32;
        s1.password = "afds";

        Student s2 = new Student(s1);
        s2.password = "xyz";

    }
}

class Student {
    String name;
    int roll;
    String password;

    // copy constructor

    Student(Student s1) {
        this.name = s1.name;
        this.roll = s1.roll;
    }

    // non-parameterized constructos
    Student() {
        System.out.println("constructor is called ..");
    }

    // parameterized constructors
    Student(String name) {
        this.name = name;
    }

    Student(int roll) {
        this.roll = roll;
    }
}