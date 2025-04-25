// return true if any value appears twice in the array
// hash set -> O(n)

import java.util.HashSet;

public class second {
    public static boolean duplicate(int n[]) {

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < n.length; i++) {
            if (set.contains(n[i])) {
                return true;
            } else {
                set.add(n[i]);
            }
        }
        return false;
    }

    public static void main(String args[]) {
        int n[] = { 1, 2, 3, 1 };
        boolean result = duplicate(n);
        System.out.println(result);
    }
}
