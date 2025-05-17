// counter from user 

import java.util.*;

public class forth {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the counter limit");
        int n = sc.nextInt();

        while (n > 0) {
            System.out.println(n);
            n--;
        }
    }
}
