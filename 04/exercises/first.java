// positive or negative number 

import java.util.*;

public class first {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");

        int a = sc.nextInt();

        String sign = (a > 0) ? "Positive" : "Negative";
        System.out.println(sign);
    }
}
