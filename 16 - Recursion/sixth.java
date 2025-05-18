// check is the array is sorted or not
public class sixth {
    public static void main(String[] args) {

    }

    public static boolean isSorted(int[] arr, int i) {
        if (arr[i] > arr[i + 1]) {
            return false;
        }

        return isSorted(arr, i + 1);
    }
}
