// function for the factorial 

import java.util.*;

public class sixth {
    public static int factorial(int a) {
        int fact = 1;

        for (int i = 1; i <= a; i++) {
            fact *= i;
        }

        return fact;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int result = factorial(a);
        System.out.println(result);
    }
}
