// entering numebr until multiple of 10 is entered

import java.util.*;

public class twelth {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the number");
            int n = sc.nextInt();

            if (n % 10 == 0) {
                break;
            }
        }

        System.out.println("out of the loop");
    }
}
