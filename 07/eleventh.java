// prime numebr checker - optimised approach 

import java.util.*;

public class eleventh {

    public static boolean prime(int n) {

        if (n == 2) {
            return true;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        boolean result = prime(n);
        System.out.println(result);
    }
}
