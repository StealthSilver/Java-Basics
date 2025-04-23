// function to find the binomial coefficient

import java.util.*;

public class seventh {

    public static int factorial(int a) {

        int fact = 1;

        for (int i = 1; i <= a; i++) {
            fact *= i;
        }

        return fact;
    }

    public static int binomial(int n, int r) {

        int coeff = factorial(n) / (factorial(r) * factorial((n - r)));

        return coeff;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        int result = binomial(n, r);
        System.out.println(result);
    }
}
