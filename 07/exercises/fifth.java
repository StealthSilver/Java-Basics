// calculating the sum of digits of a number

public class fifth {

    public static int Sum(int a) {
        int digitSum = 0;
        ;

        while (a > 0) {
            int lastDigit = a % 10;
            digitSum += lastDigit;
            a /= 10;

        }
        return digitSum;
    }

    public static void main(String args[]) {
        int a = 478374;
        int result = Sum(a);
        System.out.println(result);
    }
}
