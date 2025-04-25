// maximum subarray sum -> prefix sum approach 
// time complexity -> O(n^2)

import java.util.*;

public class second {

    public static int prefixSum(int numbers[]) {

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        // creating the prefix array
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];

        // calculate prefix array
        for (int i = 1; i < numbers.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }

        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }

        return maxSum;

    }

    public static void main(String args[]) {
        int[] numbers = { -1, 3, 4, 2, -5, 4, -5, 2 };

        int result = prefixSum(numbers);
        System.out.println("the maximum subarray sum is : " + result);
    }
}
