// printing prime numebrs in a range 

import java.util.*;

public class twelth {

    public static boolean isPrime(int n) {
        if (n < 2)
            return false;

        if (n == 2)
            return true;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void prime(int range) {
        for (int i = 2; i <= range; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the range:");
        int range = sc.nextInt();

        prime(range);
    }
}
