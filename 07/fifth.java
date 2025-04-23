// function for product of two numbers 

import java.util.*;

public class fifth {
    public static int product(int a, int b) {
        return a * b;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = product(a, b);
        System.out.println(result);

    }
}
