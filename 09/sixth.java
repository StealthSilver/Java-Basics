// largest element in an array

import java.util.*;

public class sixth {

    public static int max(int numbers[]) {
        int largest = Integer.MIN_VALUE; // this signifies -infinity and it is a part of java.util

        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
        }
        return largest;
    }

    public static void main(String args[]) {
        int numbers[] = { 2, 3, 4, 1, 2, 3, 676, 42, 12, 9 };

        int largest = max(numbers);

        System.out.println("the largest number in array is " + largest);
    }
}
