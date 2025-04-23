// checking if a numebr is pallindrome 

import java.util.*;

public class third {

    public static boolean isPallindrome(int a) {

        int pallindrome = a;
        int reverse = 0;

        while (pallindrome != 0) {
            int remainder = pallindrome % 10;
            reverse = reverse * 10 + remainder;
            pallindrome = pallindrome / 10;
        }

        if (a == reverse) {
            return true;
        }
        return false;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int a = sc.nextInt();

        boolean result = isPallindrome(a);

        System.out.println(result);

    }
}
