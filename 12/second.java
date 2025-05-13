public class second {
    public static void main(String args[]) {

        Student s1 = new Student("pogo");
        Student s2 = new Student();
        Student s3 = new Student(32);
    }
}

class Student {
    String name;
    int roll;

    // constructor with initialization

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