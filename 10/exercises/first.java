// return true if any value appears twice in the array
// brute force -> O(n^2)

public class first {

    public static boolean check(int num[]) {
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] == num[j])
                    return true;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        int num[] = { 1, 2, 3 };

        boolean result = check(num);
        System.out.println(result);
    }
}
