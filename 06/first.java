// printing the star pattern 

public class first {
    public static void main(String args[]) {

        // outer loop -> get the number of lines
        for (int i = 1; i <= 4; i++) {

            // inner loop -> get the number of characters in each line
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
