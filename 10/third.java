// prefix sum -> Kadane's Algorithm
// Time complexity

public class third {

    public static int kadane(int[] numbers) {

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            currSum = currSum + numbers[i];
            if (currSum < 0) {
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }

        return maxSum;
    }

    public static void main(String args[]) {
        int[] numbers = { 1, 2, -5, -6, 4, -3, 2, 6, 1 };

        int result = kadane(numbers);
        System.out.println("the maximum sum is : " + result);
    }
}
