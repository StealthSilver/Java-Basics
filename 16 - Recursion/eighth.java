// find the last occourance of an element in an array
// time complexity O(n)
// space complexity O(n)

public class eighth {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 6, 7, 5, 4 };
        int key = 5;
        System.out.println(lastOcc(arr, key, 0));
    }

    public static int lastOcc(int[] arr, int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOcc(arr, key, i + 1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }

        return isFound;
    }
}
