// sum of the prices 

import java.util.*;

public class third {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        float price_a = sc.nextFloat();
        float price_b = sc.nextFloat();
        float price_c = sc.nextFloat();

        float total_price = (price_a + price_b + price_c);
        System.out.println(total_price);

    }
}
