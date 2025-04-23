
// sum of two numbers as a function 
import java.util.*;

public class second {

    public static int Sum(int a, int b) {

        return a + b;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        int result = Sum(x, y);
        System.out.println(result);
    }
}
