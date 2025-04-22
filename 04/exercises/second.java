// thermometer

import java.util.*;

public class second {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your body temp in F : ");
        double temp = sc.nextDouble();

        String result = (temp >= 100) ? "FEVER" : "NO FEVER";
        System.out.println(result);

    }
}
