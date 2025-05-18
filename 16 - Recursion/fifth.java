// nth fibonacci number 
// time complexity -> O(2^n) -> exponential 
// space complexity -> O(n) as the height of tree is n

public class fifth {
    public static void main(String[] args) {
        int n = 24;
        System.out.println(fib(n));
    }

    public static int fib(int n) {

        if (n == 0 || n == 1) {
            return n;
        }
        int fnm1 = fib(n - 1);
        int fnm2 = fib(n - 2);

        int fn = fnm1 + fnm2;

        return fn;
    }
}
