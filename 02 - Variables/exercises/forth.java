
public class forth {
    public static void main(String args[]) {
        byte b = 4;
        char c = 'a';
        short s = 321;
        int i = 1000;
        float f = 3.14f;
        double d = 44.3231;

        double result = (f * b) + (i % c) - (d * s);
        System.out.println(result);
    }
}
