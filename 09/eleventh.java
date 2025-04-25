// pairs in an array
// total pairs = n * (n-1) /  2 (sum of n-1 terms)

public class eleventh {

    public static void pairs(int numbers[]) {

        int totalPairs = 0;

        for (int i = 0; i < numbers.length; i++) {
            int curr = numbers[i];

            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + curr + "," + numbers[j] + ") ");
                totalPairs++;
            }
            System.out.println();
        }
        System.out.println("total pairs = " + totalPairs);
    }

    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6, 8, 10 };

        pairs(numbers);
    }
}
