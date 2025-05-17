// 0 - 1 triangle pattern

public class fifth {

    public static void zero_one_triangle(int n) {

        // outer loop
        for (int i = 1; i <= n; i++) {

            // inner loop
            for (int j = 1; j <= i; j++) {

                // checking for even cells
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        zero_one_triangle(7);
    }
}
