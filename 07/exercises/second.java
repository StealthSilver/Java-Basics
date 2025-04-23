// // checking is a numebr is even 

public class second {

    public static boolean isEven(int a) {
        return a % 2 == 0 ? true : false;
    }

    public static void main(String args[]) {
        int a = 44;
        boolean result = isEven(a);

        System.out.println(result);
    }
}
