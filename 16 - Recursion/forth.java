
public class forth {
    public static void main(String args[]) {
        int n = 10;
        System.out.println(Sumn(n));
    }

    public static int Sumn(int n) {

        if (n == 1) {
            return 1;
        }
        int Sumnm1 = Sumn(n - 1);
        int Sn = n + Sumnm1;

        return Sn;
    }
}
