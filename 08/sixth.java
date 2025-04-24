// Butterfly Pattern

public class sixth {

    public static void butterfly(int n) {

        // first half
        for (int i = 1; i <= n; i++) {
            // starts -> i

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // spaces -> 2*(n-1)

            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // starts -> i

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // second half

        for (int i = n; i >= 1; i--) {

            // starts -> i

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // spaces -> 2*(n-1)

            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // starts -> i

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }

    public static void main(String args[]) {
        butterfly(8);
    }
}
