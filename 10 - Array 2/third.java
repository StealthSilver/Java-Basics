// prefix sum -> Kadane's Algorithm
// Time complexity -> O(n)

public class third {

    public static int kadane(int[] numbers) {
        int currSum = numbers[0];
        int maxSum = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            currSum = Math.max(numbers[i], currSum + numbers[i]);
            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;
    }

    public static void main(String args[]) {

        int[] numbers = { -2, -3, -1, -5 };

        int result = kadane(numbers);
        System.out.println("The maximum subarray sum is: " + result);
    }
}
