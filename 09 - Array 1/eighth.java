// binary search O(logn)

public class eighth {

    public static int binarySearch(int numbers[], int key) {

        int start = 0, end = numbers.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            // for really large arrays
            // int mid = start + (end - start) / 2;

            // comparisions
            if (numbers[mid] == key) {
                return mid;
            } else if (numbers[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1; // not found condition
    }

    public static void main(String args[]) {
        int numbers[] = { 2, 4, 5, 8, 10, 12, 14 };
        int key = 10;

        System.out.println("index for key is : " + binarySearch(numbers, key));

    }
}
