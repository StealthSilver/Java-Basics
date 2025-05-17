// inverted half pyramid with numbers 

public class third {

    public static void inv_pyr_num(int n) {

        // outer loop
        for (int i = 1; i <= n; i++) {

            // inner loop
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        inv_pyr_num(6);
    }
}
