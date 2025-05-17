// checking even or odd 

import java.util.*;

public class forth {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}