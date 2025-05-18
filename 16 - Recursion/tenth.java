// optimized x to the power n 
// time complexity O(logn)

public class tenth {
    public static void main(String[] args) {
        int x = 2;
        int n = 10;
        System.out.println(opPower(int x, int n));
    }

    public static int opPower(int a, int n) {
        int halfPowerSq = opPower(a, n / 2) * opPower(a, n / 2);

        // n is odd
        if (n % 2 != 0) {
            halfPowerSq = a * halfPowerSq;
        }

        return halfPowerSq;
    }
}
