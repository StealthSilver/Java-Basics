// print num 1 - n , increasing order
public class second {

    public static void printInc(int n) {

        if (n == 1) {
            System.out.println(n);
            return;
        }
        printInc(n - 1);
        System.out.println(n + " ");
    }

    public static void main(String[] args) {
        int n = 10;
        printInc(n);
    }
}
