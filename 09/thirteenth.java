// max and min sum of all the subarrays

public class thirteenth {

    public static void subarraySums(int numbers[]) {
        int totalSubarrays = 0;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;

        // Outer loop -> start index
        for (int i = 0; i < numbers.length; i++) {
            int start = i;

            // Middle loop -> end index
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                int sum = 0;

                // Inner loop -> print subarray and calculate sum
                System.out.print("Subarray: ");
                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k] + " ");
                    sum += numbers[k];
                }

                if (sum > maxSum) {
                    maxSum = sum;
                }
                if (sum < minSum) {
                    minSum = sum;
                }

                totalSubarrays++;
                System.out.println("=> Sum = " + sum);
            }
        }

        System.out.println("\nTotal subarrays = " + totalSubarrays);
        System.out.println("Maximum subarray sum = " + maxSum);
        System.out.println("Minimum subarray sum = " + minSum);
    }

    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6, 8, 10 };

        subarraySums(numbers);
    }
}
