// maximum subarray sum -> brute force
// time comp -> O(n^3)

import java.util.*;

public class first {

    public static int subarray(int[] number) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < number.length; i++) {
            int start = i;

            for (int j = i; j < number.length; j++) {
                int end = j;
                currSum = 0;

                for (int k = start; k <= end; k++) {
                    currSum += number[k];
                }

                if (maxSum < currSum) {
                    maxSum = currSum;
                }

            }
        }
        return maxSum;

    }

    public static void main(String args[]) {
        int[] number = { 1, -2, 6, -1, 3 };

        int result = subarray(number);
        System.out.println("the maximum subaraay sum is  " + result);
    }
}
