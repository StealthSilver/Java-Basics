// floyd's triangle 

public class forth {

    public static void floyd_triangle(int n) {
        // outer loop -> total lines

        int counter = 1;

        for (int i = 1; i <= n; i++) {
            // inner loop -> number of times the counter will be printed
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        floyd_triangle(7);
    }
}
