public class second {
    public static void main(String args[]) {
        Student s1 = new Student("pogo");
    }
}

class Student {
    String name;
    int roll;

    // constructor with initialization
    Student(String name) {
        this.name = name;
    }
}