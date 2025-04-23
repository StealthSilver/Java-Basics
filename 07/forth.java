// call by value in java

public class forth {
    public static void swap(int a, int b) {

        // swapping
        int temp = a;
        a = b;
        b = temp;
        System.out.println("inside the swap function");

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void main(String args[]) {
        int a = 5;
        int b = 10;

        swap(a, b);
        System.out.println("inside the main function");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
