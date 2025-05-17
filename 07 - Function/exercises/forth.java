// using the math class 
public class forth {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Minimum
        int min = Math.min(a, b);
        System.out.println("Min: " + min);

        // Maximum
        int max = Math.max(a, b);
        System.out.println("Max: " + max);

        // Square root
        double squareRoot = Math.sqrt(49);
        System.out.println("Square Root of 49: " + squareRoot);

        // Power
        double power = Math.pow(2, 5); // 2^5 = 32
        System.out.println("2 raised to 5: " + power);

        // Average (manually)
        double avg = (a + b) / 2.0;
        System.out.println("Average of " + a + " and " + b + ": " + avg);
    }
}
