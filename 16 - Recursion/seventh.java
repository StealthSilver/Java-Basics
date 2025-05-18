// find the first occourance of an element in an array
public class seventh {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 6, 7 };
        int key = 4;
        System.out.println(firstOcc(arr, key, 0));
    }

    public static int firstOcc(int[] arr, int key, int i) {

        if (i == arr.length) {
            return -1;
        }

        if (arr[i] == key) {
            return i;
        }

        return firstOcc(arr, key, i + 1);

    }
}
