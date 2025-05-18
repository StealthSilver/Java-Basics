
public class forth {
    public static void main(String args[]) {
        int n = 10;
        Sumn(n);
    }

    public static int Sumn(int n) {
        int Sumnm1 = Sumn(n - 1);
        int Sn = n + Sumnm1;

        return Sn;
    }
}
