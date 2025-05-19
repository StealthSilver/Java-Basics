// inpbuilt sort reverse

import java.util.Arrays;
import java.util.Collections;

public class fifth {
    public static void main(String[] args) {
        // here array must be an object of the Integer class
        Integer[] arr = { 5, 4, 6, 3, 2, 1 };
        Arrays.sort(arr, Collections.reverseOrder());
        printArr(arr);
    }

    public static void printArr(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}