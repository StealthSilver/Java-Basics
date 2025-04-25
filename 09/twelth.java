// print subarrays
// total subarrays n * (n+1) / 2 
// time O()

public class twelth {

    public static void subarray(int numbers[]) {
        int ts = 0;

        // outer loop -> start index
        for (int i = 0; i < numbers.length; i++) {
            int start = i;

            // middle loop -> end index
            for (int j = i; j < numbers.length; j++) {
                int end = j;

                // inner loop -> print subarray from start to end
                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k] + " ");
                }

                ts++;
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("total subarrays = " + ts);
    }

    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6, 8, 10 };

        subarray(numbers);
    }
}
