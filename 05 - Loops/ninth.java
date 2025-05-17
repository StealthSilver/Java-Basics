// reversing the given number 

import java.util.*;

public class ninth {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");

        int num = sc.nextInt();
        int rev = 0;

        while (num > 0) {
            int lastDigit = num % 10;
            rev = (rev * 10) + lastDigit;
            num = num / 10;
        }

        System.out.println(rev);
    }
}
