// smallest value in array O(n)

import java.util.*;

public class seventh {

    public static int mim(int numbers[]) {
        int smallest = Integer.MAX_VALUE; // this signifies +infinity and it is a part of java.util

        for (int i = 0; i < numbers.length; i++) {
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        return smallest;
    }

    public static void main(String args[]) {
        int numbers[] = { 2, 3, 4, 1, 2, 3, 676, 42, 12, 9 };

        int smallest = mim(numbers);

        System.out.println("the smallest number in array is " + smallest);
    }
}
