// optimized x to the power n 
// time complexity O(logn)

public class tenth {
    public static void main(String[] args) {
        int a = 2;
        int n = 10;
        System.out.println(opPower(a, n));
    }

    public static int opPower(int a, int n) {
        // Base case: anything power 0 is 1
        if (n == 0) {
            return 1;
        }

        int halfPower = opPower(a, n / 2);
        int result = halfPower * halfPower;

        // If n is odd, multiply once more by a
        if (n % 2 != 0) {
            result *= a;
        }

        return result;
    }
}
