// converting the decimal number into binary 

public class forteenth {

    public static void decToBin(int n) {
        int Num = n;
        int pow = 0;
        int binNum = 0;

        while (n > 0) {
            int rem = n % 2;
            binNum = binNum + (rem * (int) Math.pow(10, pow));

            pow++;
            n = n / 2;

        }

        System.out.println("binary form of " + Num + " = " + binNum);
    }

    public static void main(String args[]) {
        decToBin(432);
    }
}
