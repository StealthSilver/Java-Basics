
public class sixteenth {
    public static void main(String args[]) {
        char a = 'a';
        char b = 'b';

        // type promotion will be done automatically due to the opearation
        System.out.println(b - a);

        short x = 5;
        byte y = 43;
        char c = 'c';
        byte bt = (byte) (a + b + c);
        System.out.println(bt);
    }
}
