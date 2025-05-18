// tiling problem -> given a "2 * n" board and tiles of size "2*1", count the numebr id ways to tile the given board using the 2*1 tiles.
// tiles can be places horizontally or vertically

public class first {
    public static void main(String args[]) {

    }

    public static int tilingProblem(int n) {

        // base case
        if (n == 0 || n == 1) {
            return 1;
        }

        // vertical choice
        int fnm1 = tilingProblem(n - 1);

        // horizontal choice
        int fnm2 = tilingProblem(n - 2);
    }
}
