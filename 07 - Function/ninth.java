// function overloading by the data type of parameters

public class ninth {

    // function to calculate int sum

    public static int sum(int a, int b) {
        return a + b;
    }

    // function to calculate float sum

    public static float sum(float a, float b) {
        return a + b;

    }

    public static void main(String args[]) {
        System.out.println(sum(3, 5));
        System.out.println(sum(3.4f, 6.7f));
    }
}
