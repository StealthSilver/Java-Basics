// largest of three numbers 

public class seventh {
    public static void main(String args[]) {
        int a = 7;
        int b = 9;
        int c = 4;

        if (a > b) {
            if (a > c) {
                System.out.println(a);
            } else {
                System.out.println(c);
            }
        } else {
            if (b > c) {
                System.out.println(b);
            } else {
                System.out.println(c);
            }
        }

    }
}
