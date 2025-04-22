// reverse of a number 

import java.util.*;

public class eighth {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        String reverse = "";

        while (num > 0) {
            reverse += num % 10;
            num = num % 10;
        }
        System.out.println(reverse);
    }
}
