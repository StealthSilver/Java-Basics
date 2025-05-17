// calculator 

import java.util.*;

public class eleventh {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the first number");
        int a = sc.nextInt();

        System.out.println("input the second number");
        int b = sc.nextInt();

        // to get the character input
        System.out.println("enter the operator");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            case '%':
                System.out.println(a % b);
                break;
            default:
                System.out.println("invalid input");
        }

    }
}
